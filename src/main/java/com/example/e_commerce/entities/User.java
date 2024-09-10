package com.example.e_commerce.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity(name = "user")
public class User  extends BaseEntity {

	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "middle_name")
	private String middleName;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "mobile_number")
	private Long mobileNumber;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "role")
	private String role;
}
