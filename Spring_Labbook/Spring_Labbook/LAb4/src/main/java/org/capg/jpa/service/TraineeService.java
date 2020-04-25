package org.capg.jpa.service;

import java.util.List;

import org.capg.jpa.entities.Trainee;

public interface TraineeService {


    Trainee newTrainee(Trainee trainee);
    public void delete(int traineeid);
	List<Trainee> retrieveAll();
    Trainee find(int id);
    public void modify(Trainee trainee);
  
}
