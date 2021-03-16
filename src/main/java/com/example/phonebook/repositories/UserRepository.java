package com.example.phonebook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.phonebook.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}