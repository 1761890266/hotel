package com.ysu.hotel.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 日志表
 */
@Data
public class Log implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Integer id;
	/**
	 * 用户id
	 */
	private Integer userId;
	/**
	 * 操作
	 */
	private String operation;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 操作时间
	 */
	private Date time;
	/**
	 * 备注
	 */
	private String note;

}
