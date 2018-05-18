/**   
 * @Package: com.whpu.action 
 * @author: Young   
 * @date: 2018年5月4日 下午3:13:03 
 */
package com.whpu.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.whpu.bean.User;
import com.whpu.service.UserService2;

/** 
 * @ClassName: DeleteUserAction 
 * @Description: TODO
 * @author: Young
 * @date: 2018年5月4日 下午3:13:03  
 */
@Controller
@Scope("prototype")
public class DeleteUserAction extends ActionSupport{

// @Fields serialVersionUID : TODO
private static final long serialVersionUID = -7734210248215754609L;
@Resource(name="userService2")
private UserService2 userService;

private User user = new User();

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

@Override
public String execute() throws Exception {
	System.out.println("-------UserAction.deleteUser-----------"+user.getUserId());
	userService.delete(user);
	return SUCCESS;
}
/* (non Javadoc) 
 * @Title: getModel
 * @Description: TODO
 * @return 
 * @see com.opensymphony.xwork2.ModelDriven#getModel() 
 */ 
}
