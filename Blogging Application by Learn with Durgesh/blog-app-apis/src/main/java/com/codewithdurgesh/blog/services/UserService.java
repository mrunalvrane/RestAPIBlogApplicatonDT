package com.codewithdurgesh.blog.services;
import java.util.List;
import com.codewithdurgesh.blog.entitities.User;
import com.codewithdurgesh.blog.payloads.UserDto;



public interface UserService {
	//we are not passing User entity directly into service class
	//we are not going to use entity in APIs anywhere for this purpose we will use DTo
	//User entity that corresponds with database.
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user, Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userId);


}
