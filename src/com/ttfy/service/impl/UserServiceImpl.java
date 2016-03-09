/**
 * 
 */
package com.ttfy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.ttfy.entity.User;
import com.ttfy.mapper.UserMapper;
import com.ttfy.service.UserService;

/**
 * @author Administrator
 *
 */
@Repository(value="userServiceImpl")
public class UserServiceImpl implements UserService {
	@Resource(name="userMapper")
	private UserMapper userMapper;

	/* (non-Javadoc)
	 * @see com.ttfy.service.UserService#create(com.ttfy.entity.User)
	 */
	@Override
	public Integer create(User user) {
		// TODO Auto-generated method stub
		return userMapper.create(user);
	}

	/* (non-Javadoc)
	 * @see com.ttfy.service.UserService#delete(java.lang.Integer)
	 */
	@Override
	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.delete(id);
	}

	/* (non-Javadoc)
	 * @see com.ttfy.service.UserService#modify(com.ttfy.entity.User)
	 */
	@Override
	public Integer modify(User user) {
		// TODO Auto-generated method stub
		return userMapper.modify(user);
	}

	/* (non-Javadoc)
	 * @see com.ttfy.service.UserService#findById(java.lang.Integer)
	 */
	@Override
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.findById(id);
	}

	/* (non-Javadoc)
	 * @see com.ttfy.service.UserService#findByUser(com.ttfy.entity.User)
	 */
	@Override
	public User findByUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.findByUser(user);
	}

	/* (non-Javadoc)
	 * @see com.ttfy.service.UserService#findAll()
	 */
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userMapper.findAll();
	}

	/* (non-Javadoc)
	 * @see com.ttfy.service.UserService#findAll(com.ttfy.entity.User)
	 */
	@Override
	public List<User> findAll(User user) {
		// TODO Auto-generated method stub
		return userMapper.findAll(user);
	}

	/* (non-Javadoc)
	 * @see com.ttfy.service.UserService#count()
	 */
	@Override
	public Integer count() {
		// TODO Auto-generated method stub
		return userMapper.count();
	}

}
