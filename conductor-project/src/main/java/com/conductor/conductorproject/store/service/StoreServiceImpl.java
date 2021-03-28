package com.conductor.conductorproject.store.service;

import com.conductor.conductorproject.store.models.Store;
import com.conductor.conductorproject.store.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    StoreRepository repository;

    @Override
    public Store getStore(Long storeId) {
        Optional<Store> store = repository.findById(storeId);
        return store.get();
    }

    @Override
    public Store postStore(Store body) {
        return repository.save(body);
    }

    @Override
    public Store updateStore(Store body) {
        return repository.save(body);
    }

    private boolean isNullOrEmpty(String validate){
        return  validate == null || validate.isEmpty();
    }
}
