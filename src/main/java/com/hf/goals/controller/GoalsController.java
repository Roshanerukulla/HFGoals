package com.hf.goals.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hf.goals.entity.GoalsEntity;
import com.hf.goals.service.GoalsService;

@RestController
@RequestMapping("/api/goals")
public class GoalsController {
	@Autowired
	private GoalsService gs;
	
	 @GetMapping("/getall")
	    public ResponseEntity<List<GoalsEntity>> getAllCoaches() {
	        List<GoalsEntity> coaches = gs.getAllGoals();
	        return ResponseEntity.ok(coaches);
	    }

	    @GetMapping("/{goalId}")
	    public ResponseEntity<GoalsEntity> getCoachById(@PathVariable Long goalId) {
	        GoalsEntity goal = gs.getGoalById(goalId);
	        if (goal != null) {
	            return ResponseEntity.ok(goal);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

}
