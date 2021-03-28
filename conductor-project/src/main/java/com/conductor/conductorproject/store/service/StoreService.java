package com.conductor.conductorproject.store.service;

import com.conductor.conductorproject.store.models.Store;

public interface StoreService {

    Store getStore(Long storeId);

    Store postStore(Store body);

    Store updateStore(Store body);

}
