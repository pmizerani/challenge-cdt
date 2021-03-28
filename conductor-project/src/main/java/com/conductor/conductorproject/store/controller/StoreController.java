package com.conductor.conductorproject.store.controller;

import com.conductor.conductorproject.store.api.StoreApi;
import com.conductor.conductorproject.store.models.Store;
import com.conductor.conductorproject.store.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.validation.Valid;

@Controller
public class StoreController implements StoreApi {

    @Autowired
    StoreService service;

    @Override
    public ResponseEntity<Store> getStore(@Valid Long storeId) {
        Store result;
        try {
            result = service.getStore(storeId);
            return new ResponseEntity<Store>(result, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<Store>(result = null, HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<Void> postStore(@Valid Store body) {
        try {
            service.postStore(body);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        } catch (Exception e){
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<Store> updateStore(@Valid Store body) {
        Store result;
        try {
            result = service.updateStore(body);
            return new ResponseEntity<Store>(result, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<Store>(result = null, HttpStatus.BAD_REQUEST);
        }
    }
}