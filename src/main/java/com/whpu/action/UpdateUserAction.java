/**   
 * @Package: com.whpu.action 
 * @author: Young   
 * @date: 2018年5月4日 下午3:13:18 
 */
package com.whpu.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.whpu.bean.User;
import com.whpu.service.UserService2;

/** 
 * @ClassName: UpdateUserAction 
 * @Description: 修改user信息
 * @author: Young
 * @date: 2018年5月4日 下午3:13:18  
 */
@Controller
@Scope("prototype")
public class UpdateUserAction extends ActionSupport{

	// @Fields serialVersionUID : TODO
	private static final long serialVersionUID = 8133672548954541780L;
	@Resource(name="userService2")
	private UserService2 userService;
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		
		userService.update(user);
		return SUCCESS;
	}
	
	public String toUpdateView(){
		System.out.println("------------------------"+user.getUserId());
		return SUCCESS;
	}

	
}
