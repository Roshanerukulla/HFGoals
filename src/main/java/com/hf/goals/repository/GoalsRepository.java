package com.hf.goals.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hf.goals.entity.GoalsEntity;

@Repository
public interface GoalsRepository extends JpaRepository<GoalsEntity,Long>{

}
