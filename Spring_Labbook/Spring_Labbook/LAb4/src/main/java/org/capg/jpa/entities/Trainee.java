package org.capg.jpa.entities;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
import javax.persistence.Table;


	    @Entity
	    @Table(name="trainee")
		public class Trainee {
			@Id
			 private Integer traineeid;
		    @Column(length=20)
		    private String traineename;
		    
		    @Column(length=20)
		    private String traineelocation;
		    
		    @Column(length=20)
		    private String traineedomain;
		    
		    public Trainee(Integer traineeid, String traineename, String traineelocation, String traineedomain) {
				super();
				this.traineeid = traineeid;
				this.traineename = traineename;
				this.traineelocation = traineelocation;
				this.traineedomain = traineedomain;
			}


		    public Trainee() {
				// TODO Auto-generated constructor stub
			}

			public Integer getTraineeid() {
				return traineeid;
			}

			public void setTraineeid(Integer traineeid) {
				this.traineeid = traineeid;
			}

			public String getTraineename() {
				return traineename;
			}

			public void setTraineename(String traineename) {
				this.traineename = traineename;
			}

			public String getTraineelocation() {
				return traineelocation;
			}

			public void setTraineelocation(String traineelocation) {
				this.traineelocation = traineelocation;
			}

			public String getTraineedomain() {
				return traineedomain;
			}

			public void setTraineedomain(String traineedomain) {
				this.traineedomain = traineedomain;
			}

		
		}




