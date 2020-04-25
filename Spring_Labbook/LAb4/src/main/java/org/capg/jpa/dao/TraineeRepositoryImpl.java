package org.capg.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.capg.jpa.entities.Trainee;
import org.springframework.stereotype.Repository;


@Repository
public class TraineeRepositoryImpl implements TraineeRepository {


	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Trainee addTrainee(Trainee trainee) {
		entityManager.persist(trainee);

		return trainee;
	}
	
	@Override
	public void delete(Integer traineeid) {
		Trainee tr=entityManager.find(Trainee.class, traineeid);
		entityManager.remove(tr);
	}

	@Override
	public Trainee findById(int traineeid) {
		  return entityManager.find(Trainee.class, traineeid);
	}

	@Override
	public void modify(Trainee trainee) {
		entityManager.merge(trainee);
		
	}

	@Override
	public List<Trainee> findAll() {
		Query q = entityManager.createQuery("from Trainee t");
        return q.getResultList();
		
   }

}
