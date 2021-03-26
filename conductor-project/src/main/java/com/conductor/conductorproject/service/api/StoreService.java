package com.conductor.conductorproject.service.api;

import com.conductor.conductorproject.models.Store;

import javax.validation.Valid;

public interface StoreService {

    Store getStore(Long storeId);

    Store postStore(Store body);

    Store updateStore(Store body);

}
