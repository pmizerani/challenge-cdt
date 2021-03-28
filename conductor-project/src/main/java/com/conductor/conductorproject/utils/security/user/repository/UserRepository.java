package com.conductor.conductorproject.utils.security.user.repository;

import com.conductor.conductorproject.utils.security.user.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {

    Users findByUserName(String userName);

}
