package com.conductor.conductorproject.service.impl;

import com.conductor.conductorproject.models.Store;
import com.conductor.conductorproject.repository.api.StoreRepository;
import com.conductor.conductorproject.service.api.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    StoreRepository repository;

    @Override
    public Store getStore(Store body) {
        Optional<Store> store;
        if(!isNullOrEmpty(body.getName())){
            store = repository.findStoreByName(body.getName());
        } else {
            store = repository.findById(body.getStoreId());
        }
        return store.get();
    }

    @Override
    public Store postStore(Store body) {
        return repository.save(body);
    }

    @Override
    public Store updateStore(Store body, Integer storeId) {
        String name = body.getName();
        String address = body.getAddress();
        return repository.updateStore(name,address,storeId);
    }

    private boolean isNullOrEmpty(String validate){
        return  validate == null || validate.isEmpty();
    }
}
