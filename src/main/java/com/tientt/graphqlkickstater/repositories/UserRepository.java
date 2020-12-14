package com.tientt.graphqlkickstater.repositories;

import com.tientt.graphqlkickstater.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}