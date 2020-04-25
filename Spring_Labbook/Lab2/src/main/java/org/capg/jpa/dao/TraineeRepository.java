package org.capg.jpa.dao;

import java.util.List;

import org.capg.jpa.entities.Trainee;

public interface TraineeRepository {


	Trainee addTrainee(Trainee trainee);
	public void delete(Integer traineeid);
	 public List<Trainee> findAll();
	Trainee findById(int traineeid);
	public void modify(Trainee trainee);
}
