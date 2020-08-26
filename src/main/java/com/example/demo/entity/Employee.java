package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author munwar
 *
 */
@Entity
@Table(name = "student" , schema = "CM")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int studentId;
	@Column
	private String studentName;
	@Column
	private String studentEmail;
	@Column
	private int studentBranch;

	
}
