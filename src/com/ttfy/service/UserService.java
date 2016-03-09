package com.ttfy.service;

import java.util.List;

import org.springframework.stereotype.Repository;
 
import com.ttfy.entity.User;
 
/** 
 *  
 * @author mwg 
 * @date 2016-03-05 16:38 
 * 
 */  
@Repository(value = "userService")
public interface UserService {
     
    Integer create(User user);
    Integer delete(Integer id);
    Integer modify(User user);
     
    User findById(Integer id);
    User findByUser(User user);
    List<User> findAll();
    List<User> findAll(User user);
     
    Integer count();
}