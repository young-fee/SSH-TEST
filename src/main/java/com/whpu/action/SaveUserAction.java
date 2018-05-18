/**   
 * @Package: com.whpu.action 
 * @author: Young   
 * @date: 2018年5月4日 下午3:12:51 
 */
package com.whpu.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.whpu.bean.User;
import com.whpu.service.UserService2;

/**
 * @ClassName: SaveUserAction
 * @Description: 新增user信息
 * @author: Young
 * @date: 2018年5月4日 下午3:12:51
 */
@Controller
@Scope("prototype")
public class SaveUserAction extends ActionSupport {

	// @Fields serialVersionUID : TODO
	private static final long serialVersionUID = 3645489979240013952L;

	@Resource(name = "userService2")
	private UserService2 userService;

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @Title: toSaveView
	 * @Description: 转发到新增页面
	 * @return String
	 * @author Young
	 * @date 2018年5月5日下午2:35:30
	 */
	public String toSaveView() {
		return SUCCESS;
	}

	/**
	 * 实现新增功能
	 */
	@Override
	public String execute() throws Exception {
		// 调用service新增方法
		System.out.println("-------UserAction.SaveUser-----------");
		userService.doCreateUser(user);
		return SUCCESS;
	}

}
