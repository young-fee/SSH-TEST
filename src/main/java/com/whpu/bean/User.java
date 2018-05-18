package com.whpu.bean;

/**
 * @ClassName: User 
 * @Description: User实体类
 * @author: Young
 * @date: 2018年5月4日 下午2:12:48
 */
public class User {
    
    private int userId;
    private String userName;
    private String password;
    private int gender;
    
    public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
    public int getUserId() {
        return userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

}