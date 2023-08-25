package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.VisitersParameters;

public interface VisitersDao extends JpaRepository<VisitersParameters, Long> {

}
