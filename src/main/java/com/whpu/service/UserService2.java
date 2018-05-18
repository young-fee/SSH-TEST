/**   
 * @Package: com.whpu.service 
 * @author: Young   
 * @date: 2018年5月4日 下午3:19:19 
 */
package com.whpu.service;

import java.util.List;

import com.whpu.bean.User;

/** 
 * @ClassName: UserService2 
 * @Description: service接口
 * @author: Young
 * @date: 2018年5月4日 下午3:19:19  
 */
public interface UserService2 {

	public void doCreateUser(User user);
    public List<User> findAllUsers();
    public void delete(User user);
    public void update(User user);
    public List<User> findUserById(int id);
}
