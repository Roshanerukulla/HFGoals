package com.hf.goals.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hf.goals.entity.GoalsEntity;

@Service
public interface GoalsService {
 public List<GoalsEntity> getAllGoals();
 public GoalsEntity getGoalById(Long Goalid);

	
} 
