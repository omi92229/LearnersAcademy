package org.simplilearn.lms.service;

import org.simplilearn.lms.dao.UserDao;
import org.simplilearn.lms.dao.UserDaoImpl;
import org.simplilearn.lms.entities.User;

public class UserServiceImpl implements UserService{
	UserDao dao=new UserDaoImpl();
	@Override
	public void insert(User user) {
		dao.insert(user);
	}

	@Override
	public User get(String username, String password) {
		return dao.get(username, password);
	}

	@Override
	public void updatePassword(String username,String password,String newPassword) {
		User user=dao.get(username, newPassword);
		user.setPassword(newPassword);
		dao.update(user);
	}
	
}
