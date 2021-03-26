package com.conductor.conductorproject.repository.api;

import com.conductor.conductorproject.models.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;


public interface StoreRepository extends JpaRepository<Store, Integer> {

    Optional<Store> findById(Integer storeId);

    Optional<Store> findStoreByName(String name);

    Store save(Store newStore);

    @Query("update Store s " +
            "set s.name = :newName, s.address = :newAddress" +
            "where s.storeId = :storeId ")
    Store updateStore(@Param("newName") String name, @Param("newAddress")String address, @Param("storeId")Integer storeId);

}
