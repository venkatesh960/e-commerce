package com.example.e_commerce.user;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDTO {

    private String userName;
    private String firstName;
    private String lastName;
    private String middleName;
    private Long mobileNumber;
    private String password;
    private String userType;
    private String emailId;
    private String role;

}
