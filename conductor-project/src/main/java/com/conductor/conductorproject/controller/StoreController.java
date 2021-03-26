package com.conductor.conductorproject.controller;

import com.conductor.conductorproject.api.StoreApi;
import com.conductor.conductorproject.models.Store;
import com.conductor.conductorproject.service.api.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.validation.Valid;

@Controller
public class StoreController implements StoreApi {

    @Autowired
    StoreService service;

    @Override
    public ResponseEntity<Store> getStore(@Valid Store body) {

        return null;
    }

    @Override
    public ResponseEntity<Store> postStore(@Valid Store body) {

        return null;
    }

    @Override
    public ResponseEntity<Store> updateStore(@Valid Store body, String storeId) {

        return null;
    }
}