package com.example.hibernatedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hibernatedemo.models.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
}