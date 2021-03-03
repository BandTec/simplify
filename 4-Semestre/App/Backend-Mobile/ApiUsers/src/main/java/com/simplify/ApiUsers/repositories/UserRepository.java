package com.simplify.ApiUsers.repositories;

import com.simplify.ApiUsers.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
