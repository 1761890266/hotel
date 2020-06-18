package com.ysu.hotel.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

/**
 * 用户表
 */
@Data
@ToString
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Integer id;
	/**
	 * 登录名
	 */
	private String login;
	/**
	 * 用户名称
	 */
	private String name;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 权限 1管理员 2经理 3前台
	 */
	private Integer permissions;
	/**
	 * 备注
	 */
	private String note;

}
