package com.conductor.conductorproject.repository.api;

import com.conductor.conductorproject.models.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;


public interface StoreRepository extends JpaRepository<Store, Long> {

    Optional<Store> findById(Long storeId);
}
