/**   
 * @Package: com.whpu.DaoImpl 
 * @author: Young   
 * @date: 2018年5月4日 下午3:17:41 
 */
package com.whpu.DaoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.whpu.bean.User;
import com.whpu.dao.UserDao2;

/** 
 * @ClassName: UserDaoImpl 
 * @Description: 数据库操作实现类
 * @author: Young
 * @date: 2018年5月4日 下午3:17:41  
 */
@Repository(value="userDao2")
@Transactional
public class UserDaoImpl implements UserDao2 {
	
	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/* (non Javadoc) 
	 * @Title: getAllUsers
	 * @Description: 从数据库查询user列表
	 * @return 
	 * @see com.whpu.dao.UserDao2#getAllUsers() 
	 */ 
	@Override
	public List<User> getAllUsers() {
		System.out.println("---------------UserDao  getAllUsers--------------");
		String hql = "from User";
		Query query = getSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<User> list = query.list();
		System.out.println("---------------UserDao  getAllUsers------over--------");
		
		return list;
	}

	/* (non Javadoc) 
	 * @Title: doCreateUser
	 * @Description: TODO
	 * @param user 
	 * @see com.whpu.dao.UserDao2#doCreateUser(com.whpu.bean.User) 
	 */ 
	@Override
	public void doCreateUser(User user) {
		 System.out.println("-------UserDaoImp.doCreateUser-----------");
		 getSession().save(user);
	}

	/* (non Javadoc) 
	 * @Title: removeUser
	 * @Description: TODO
	 * @param user 
	 * @see com.whpu.dao.UserDao2#removeUser(com.whpu.bean.User) 
	 */ 
	@Override
	public void removeUser(User user) {
		System.out.println("-------UserDaoImp.removeUser-----------");
		getSession().delete(user);
		System.out.println("-------UserDaoImp.removeUser----over-------");
	}

	/* (non Javadoc) 
	 * @Title: updateUser
	 * @Description: TODO
	 * @param user 
	 * @see com.whpu.dao.UserDao2#updateUser(com.whpu.bean.User) 
	 */ 
	@Override
	public void updateUser(User user) {
		getSession().update(user);
	}

	/* (non Javadoc) 
	 * @Title: findUserById
	 * @Description: TODO
	 * @param id
	 * @return 
	 * @see com.whpu.dao.UserDao2#findUserById(int) 
	 */ 
	@SuppressWarnings("unchecked")
	@Override
	public List<User> findUserById(int id) {
		System.out.println("-------UserDaoImp.findUserById-----------"+id);
		String hql = "from User user where user.userId =:userId";
		Query query = getSession().createQuery(hql);
		query.setInteger("userId", id);
		List<User> list = query.list();
		return list;
	}

	

}
