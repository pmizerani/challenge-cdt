package com.conductor.conductorproject.controller;

import com.conductor.conductorproject.api.StoreApi;
import com.conductor.conductorproject.models.Store;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class StoreController implements StoreApi {

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