package com.conductor.conductorproject.store.repository;

import com.conductor.conductorproject.store.models.Store;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface StoreRepository extends JpaRepository<Store, Long> {

    Optional<Store> findById(Long storeId);
}
