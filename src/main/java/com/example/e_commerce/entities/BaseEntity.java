package com.example.e_commerce.entities;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@MappedSuperclass
public class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "created")
	private int createdBy;
	
	@Column(name = "created_timestamp")
	private String createdTimeStamp;
	
	@Column(name = "update_timestamp")
	private String updatedTimeStamp;
	
	
}
