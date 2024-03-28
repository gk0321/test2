package com.example.StudentMarkSheet.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentmarksheet")
public class StudentMarkSheet {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int rollnumber;
	private int sem1Theory;
	private int sem2Theory;
	private int sem1Practicals;
	private int sem2Pracxticals;
	private int sem1Total;
	private int sem2Total;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public int getSem1Theory() {
		return sem1Theory;
	}
	public void setSem1Theory(int sem1Theory) {
		this.sem1Theory = sem1Theory;
	}
	public void setSem2Theory(int sem1Theory) {
		this.sem1Theory = sem1Theory;
	}
	public int getSem2Theory() {
		return sem1Theory;
	}
	public int getSem1Practicals() {
		return sem1Practicals;
	}
	public void setSem1Practicals(int sem1Practicals) {
		this.sem1Practicals = sem1Practicals;
	}
	public int getSem2Pracxticals() {
		return sem2Pracxticals;
	}
	public void setSem2Pracxticals(int sem2Pracxticals) {
		this.sem2Pracxticals = sem2Pracxticals;
	}
	public int getSem1Total() {
		return sem1Total;
	}
	public void setSem1Total(int sem1Total) {
		this.sem1Total = sem1Total;
	}
	public int getSem2Total() {
		return sem2Total;
	}
	public void setSem2Total(int sem2Total) {
		this.sem2Total = sem2Total;
	}

}
