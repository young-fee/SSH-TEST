/**   
 * @Package: com.whpu.action 
 * @author: Young   
 * @date: 2018年5月4日 下午3:12:35 
 */
package com.whpu.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.whpu.bean.User;
import com.whpu.service.UserService2;

/**
 * @ClassName: ListUserAction
 * @Description: 显示user列表
 * @author: Young
 * @date: 2018年5月4日 下午3:12:35
 */
@Controller
@Scope("prototype")
public class ListUserAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Resource(name = "userService2")
	private UserService2 userService;
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/*
	 * (non Javadoc)
	 * 
	 * @Title: execute
	 * 
	 * @Description: 显示user列表
	 * 
	 * @return
	 * 
	 * @throws Exception
	 * 
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		System.out.println("----------ListUserAction.excute()-----------");

		Map<String, Object> requestMap = new HashMap<String, Object>();
		requestMap = (Map<String, Object>) ActionContext.getContext().get(
				"request");
		requestMap.put("list", userService.findAllUsers());
		System.out.println("----------ListUserAction.excute()------over----");
		return SUCCESS;
	}

	@SuppressWarnings("unchecked")
	public String findUserById(){
		
		Map<String, Object> map = (Map<String, Object>) ActionContext.getContext().get("request");
		map.put("list", userService.findUserById(user.getUserId()));
		return SUCCESS;
	}
}
