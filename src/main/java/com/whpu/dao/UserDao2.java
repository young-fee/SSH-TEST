/**   
 * @Package: com.whpu.dao 
 * @author: Young   
 * @date: 2018年5月4日 下午3:17:19 
 */
package com.whpu.dao;

import java.util.List;

import com.whpu.bean.User;

/** 
 * @ClassName: UserDao2 
 * @Description: userDao2接口
 * @author: Young
 * @date: 2018年5月4日 下午3:17:19  
 */
public interface UserDao2 {
	public void doCreateUser(User user);  
    public List<User> getAllUsers();  
    public void removeUser(User user);  
    public void updateUser(User user);  
    public List<User> findUserById(int id);
}
