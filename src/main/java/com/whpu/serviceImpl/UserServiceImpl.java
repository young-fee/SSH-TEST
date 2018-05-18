/**   
 * @Package: com.whpu.serviceImpl 
 * @author: Young   
 * @date: 2018年5月4日 下午3:19:42 
 */
package com.whpu.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.whpu.bean.User;
import com.whpu.dao.UserDao2;
import com.whpu.service.UserService2;

/** 
 * @ClassName: UserServiceImpl 
 * @Description: 用于实现具体业务
 * @author: Young
 * @date: 2018年5月4日 下午3:19:42  
 */
@Service("userService2")
public class UserServiceImpl implements UserService2 {
	
	@Resource(name = "userDao2")
	private UserDao2 userDao;

	/* (non Javadoc) 
	 * @Title: findAllUsers
	 * @Description: 查询所有的user
	 * @return 
	 * @see com.whpu.service.UserService2#findAllUsers() 
	 */ 
	@Override
	public List<User> findAllUsers() {
		
		System.out.println("-------UserService.findAllUsers-----------");
		return userDao.getAllUsers();
	}

	/* (non Javadoc) 
	 * @Title: doCreateUser
	 * @Description: TODO
	 * @param user 
	 * @see com.whpu.service.UserService2#doCreateUser(com.whpu.bean.User) 
	 */ 
	@Override
	public void doCreateUser(User user) {
		 System.out.println("-------UserService.doCreateUser-----------");
		 userDao.doCreateUser(user);
	}

	/* (non Javadoc) 
	 * @Title: delete
	 * @Description: TODO
	 * @param user 
	 * @see com.whpu.service.UserService2#delete(com.whpu.bean.User) 
	 */ 
	@Override
	public void delete(User user) {
		System.out.println("-------UserService.delete-----------");
		userDao.removeUser(user);
	}

	/* (non Javadoc) 
	 * @Title: update
	 * @Description: TODO
	 * @param user 
	 * @see com.whpu.service.UserService2#update(com.whpu.bean.User) 
	 */ 
	@Override
	public void update(User user) {
		userDao.updateUser(user);
	}

	/* (non Javadoc) 
	 * @Title: findUserById
	 * @Description: TODO
	 * @param id
	 * @return 
	 * @see com.whpu.service.UserService2#findUserById(int) 
	 */ 
	@Override
	public List<User> findUserById(int id) {
		userDao.findUserById(id);
		return null;
	}

}
