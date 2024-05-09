package com.loads.loads.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loads.loads.entities.Load;

@Repository
public interface LoadDao extends JpaRepository<Load, Long>{

    
} 