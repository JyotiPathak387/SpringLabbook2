package org.capg.jpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.capg.jpa.dao.TraineeRepository;
import org.capg.jpa.entities.Trainee;
import org.capg.jpa.exceptions.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TraineeServiceImpl implements TraineeService{

	@Autowired
	private TraineeRepository traineeRepository;
	
	@Transactional
	@Override
	public Trainee newTrainee(Trainee trainee) {
		try
		{
		return traineeRepository.addTrainee(trainee);
		}
		catch(Exception e)
		{
			throw new ApplicationException("Trainee with "+trainee.getTraineeid() +" already exists !");
		}
	}
	@Transactional
	@Override
	public void delete(int traineeid) {
		Trainee t=traineeRepository.findById(traineeid);
		if(t!=null){
             traineeRepository.delete(traineeid);
		}
		else
			throw new ApplicationException("Trainee with "+traineeid+"doesn't exists!");
	}

	@Transactional
	@Override
	public Trainee find(int traineeid) {
	  Trainee t = traineeRepository.findById(traineeid);
	  if(t != null)
	  {
		  return traineeRepository.findById(traineeid);
	  }
	  
	  else
		  throw new ApplicationException("Trainee with "+traineeid+ "doesn't exists!");
	}
	
	@Transactional
	@Override
	public void modify(Trainee trainee) {
		Trainee t1 = traineeRepository.findById(trainee.getTraineeid());
		if(t1 != null)
		{
         traineeRepository.modify(trainee);
		}
		
		else
			  throw new ApplicationException("Trainee with "+t1.getTraineeid()+ "doesn't exists!");
	}
	
	@Transactional
	@Override
	public List<Trainee> retrieveAll() {
		return traineeRepository.findAll();	}
		
	

}
