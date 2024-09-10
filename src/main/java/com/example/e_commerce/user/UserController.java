package com.example.e_commerce.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/e-commerce/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/addUser")
    private Boolean addUser(@RequestBody UserDTO userDTO){
        return userService.addUser(userDTO);
    }

    @PutMapping(value = "/updateUser")
    private boolean updateUser(@RequestBody UserDTO userDTO)
    {
        return userService.updateService(userDTO);
    }

    @DeleteMapping(value="/deleteUser")
    private Boolean deleteUser(@RequestParam Long mobileNumber,@RequestParam String userName){
        return userService.deleteUser(mobileNumber,userName);
    }
    @GetMapping(value = "/getUserDetails")
    private UserDTO getUserDetails(@RequestParam Long mobileNumber,@RequestParam String userName)
    {
        return userService.getUserDetails(mobileNumber,userName);
    }

	
}
