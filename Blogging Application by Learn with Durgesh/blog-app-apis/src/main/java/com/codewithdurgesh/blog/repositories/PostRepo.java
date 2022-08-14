package com.codewithdurgesh.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithdurgesh.blog.entitities.Category;
import com.codewithdurgesh.blog.entitities.Post;
import com.codewithdurgesh.blog.entitities.User;

public interface PostRepo extends JpaRepository<Post,Integer> {
	
List<Post> findbyUser(User user);

List<Post> findByByCategory(Category category);


	
}
