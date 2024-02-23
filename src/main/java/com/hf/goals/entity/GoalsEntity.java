package com.hf.goals.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "goals")
public class GoalsEntity {

	@Id
	public Long goalId;
	@Column(name="goalName")
   public String goalName;
   @Column(name="goalDescription")
   public String goalDescription;

@Override
public String toString() {
	return "GoalsEntity [goalId=" + goalId + ", goalName=" + goalName + ", goalDescription=" + goalDescription + "]";
}

public Long getGoalId() {
	return goalId;
}

public void setGoalId(Long goalId) {
	this.goalId = goalId;
}

public String getGoalName() {
	return goalName;
}

public void setGoalName(String goalName) {
	this.goalName = goalName;
}

public String getGoalDescription() {
	return goalDescription;
}

public void setGoalDescription(String goalDescription) {
	this.goalDescription = goalDescription;
}
	
	
}
