package com.example.bloonsmonkey_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bloonsmonkey_api.model.BloonsMonkey;

public interface BloonsMonkeyRepository extends JpaRepository<BloonsMonkey, Long>{
    
}
