package org.capg.jpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.capg.jpa.dao.TraineeRepository;
import org.capg.jpa.entities.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TraineeServiceImpl implements TraineeService{

	@Autowired
	private TraineeRepository traineeRepository;
	
	@Transactional
	@Override
	public Trainee newTrainee(Trainee trainee) {
		return traineeRepository.addTrainee(trainee);
	}
	@Transactional
	@Override
	public void delete(int traineeid) {
		Trainee t=traineeRepository.findById(traineeid);
		if(t!=null){
             traineeRepository.delete(traineeid);
		}
		
	}

	@Transactional
	@Override
	public Trainee find(int traineeid) {
	    return traineeRepository.findById(traineeid);
	}
	
	@Transactional
	@Override
	public void modify(Trainee trainee) {
         traineeRepository.modify(trainee);
		}
	
	@Transactional
	@Override
	public List<Trainee> retrieveAll() {
		return traineeRepository.findAll();	}
		
	

}
