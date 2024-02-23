package com.hf.goals.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hf.goals.entity.GoalsEntity;
import com.hf.goals.repository.GoalsRepository;

@Service
public class GoalsServiceImpl implements GoalsService {

	 @Autowired
	 GoalsRepository gr;
	
	@Override
	public List<GoalsEntity> getAllGoals() {
		return gr.findAll();
	}

	@Override
	public GoalsEntity getGoalById(Long Goalid) {
		// TODO Auto-generated method stub
		Optional<GoalsEntity> optionalGoal = gr.findById(Goalid);
        return optionalGoal.orElse(null);
	}

}



















