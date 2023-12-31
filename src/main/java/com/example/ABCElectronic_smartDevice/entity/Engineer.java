package com.example.ABCElectronic_smartDevice.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Engineer 
{
	@Id

	private int engineerId;
	private String engineerName;
	private String password;
	private String domain;
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	private List<Complaint> complaints;
}
