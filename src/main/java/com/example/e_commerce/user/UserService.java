package com.example.e_commerce.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.e_commerce.entities.User;

@Service
public class UserService {

    @Autowired
    private UserRepositry userRepositry;

    public Boolean addUser(UserDTO userDTO) {
        User user=userRepositry.findByUserNameAndMobileNumber(userDTO.getUserName(),userDTO.getMobileNumber());
        if (user!=null) {
            return false;
        } else {

            User newUser=new User();
            newUser.setFirstName(userDTO.getFirstName());
            newUser.setLastName(userDTO.getLastName());
            newUser.setMiddleName(userDTO.getMiddleName());
            newUser.setMobileNumber(userDTO.getMobileNumber());
            newUser.setPassword(userDTO.getPassword());
            newUser.setEmailId(userDTO.getEmailId());
            newUser.setUserName(userDTO.getUserName());
            newUser.setRole(userDTO.getRole());

            if (userRepositry.save(newUser)!=null) {
                return true;
            }
        }
        return false;
        
    }

    public boolean updateService(UserDTO userDTO) {
        User exisitUser = userRepositry.findByUserNameAndMobileNumber(userDTO.getUserName(),userDTO.getMobileNumber());
        if (exisitUser==null) {
            return false;
        }
        exisitUser.setFirstName(userDTO.getFirstName());
        exisitUser.setLastName(userDTO.getLastName());
        exisitUser.setMiddleName(userDTO.getMiddleName());
        exisitUser.setMobileNumber(userDTO.getMobileNumber());
        exisitUser.setPassword(userDTO.getPassword());
        exisitUser.setEmailId(userDTO.getEmailId());
        exisitUser.setUserName(userDTO.getUserName());
        return  false;
    }

    public Boolean deleteUser(Long mobileNumber, String userName) {
        User exisitUser = userRepositry.findByUserNameAndMobileNumber(userName,mobileNumber);
        if (exisitUser==null) {
            return false;
        }
        userRepositry.delete(exisitUser);
        return true;
    }

    public UserDTO getUserDetails(Long mobileNumber, String userName) {
        User exisitUser = userRepositry.findByUserNameAndMobileNumber(userName,mobileNumber);
        if (exisitUser==null) {
            return null;
        }
        UserDTO userDTO=new UserDTO();
        userDTO.setFirstName(exisitUser.getFirstName());
        userDTO.setLastName(exisitUser.getLastName());
        userDTO.setMiddleName(exisitUser.getMiddleName());
        userDTO.setMobileNumber(exisitUser.getMobileNumber());
        userDTO.setPassword(exisitUser.getPassword());
        userDTO.setEmailId(exisitUser.getEmailId());
        userDTO.setUserName(exisitUser.getUserName());
        return userDTO;
       
    }



}
