package com.example.whereto.repository.implementation;

import com.example.whereto.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long>
{
    Optional<User> findByUsernameAndPassword(String username,String password);

}
