package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.NewEntity;

public interface NewRepository extends JpaRepository<NewEntity, Long> {
	
}
