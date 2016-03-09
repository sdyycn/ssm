package com.ttfy.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import com.ttfy.entity.User;
import com.ttfy.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@Resource(name="userServiceImpl")
	private UserService userService;
	
	@RequestMapping(value="**/list")
	public ModelAndView getAllUser() throws Exception {
		Map<String, Object>map = new HashMap<String, Object>();

		List<User> result = new ArrayList<User>();
		result = userService.findAll();
		
		map.put("result", result);
		return new ModelAndView("/user/list", map);
	}
	
	@RequestMapping(value="**/list/{id}")
	public ModelAndView getTheUser(@PathVariable("id") int id){
		Map<String, Object> map = new HashMap<String, Object>();
        
        List<User> result = new ArrayList<User>();
        result.add(userService.findById(id));
        map.put("result", result);
         
        return new ModelAndView("/user/list", map);
	}
	
	@RequestMapping(value = "**/doAdd")  
    public String addUser(User user){  
        userService.create(user);
 
        Map<String, Object> map = new HashMap<String, Object>();
         
        List<User> result = new ArrayList<User>();
        result = userService.findAll();
          
        map.put("result", result);
        return "redirect:list";
    }    
   
    /** 
     * @return 
     */  
    @RequestMapping(value = "**/delete/{id}")  
    public String deleteTheUser(@PathVariable("id") int id){  
        Map<String, Object> map = new HashMap<String, Object>();
         
        userService.delete(id);
         
        List<User> result = new ArrayList<User>();
        result = userService.findAll();
        map.put("result", result);
         
        return "redirect:/user/list";
    }  
}
