package com.login.loginrestapi.repository;

import com.login.loginrestapi.models.ERole;
import com.login.loginrestapi.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
