package com.school.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
	public class Student {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="id")
		private Long id;
		@Column(name="name")
		private String name;
		@Column(name="passportNumber")
		private String passportNumber;
		@Column(name="fullTime")
		private Boolean fullTime;
		public  Student(){
			
		}
		
		public Student(Long id, String name, String passportNumber, Boolean fullTime) {
			super();
			this.id = id;
			this.name = name;
			this.passportNumber = passportNumber;
			this.fullTime = fullTime;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", passportNumber=" + passportNumber + ", fullTime="
					+ fullTime + "]";
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassportNumber() {
			return passportNumber;
		}
		public void setPassportNumber(String passportNumber) {
			this.passportNumber = passportNumber;
		}
		public Boolean isFullTime() {
			return fullTime;
		}
		public void setFullTime(Boolean fullTime) {
			this.fullTime = fullTime;
		}
		
		
		
		
}
