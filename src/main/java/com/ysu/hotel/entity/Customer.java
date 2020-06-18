package com.ysu.hotel.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会员表
 *
 */
@Data
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Integer id;
	/**
	 * 会员名称
	 */
	private String name;
	/**
	 * 0-男,1-女
	 */
	private Integer sex;
	/**
	 * 电话
	 */
	private String tel;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 积分
	 */
	private Integer integra;
	/**
	 * 等级
	 */
	private Integer level;
	/**
	 * 最后一次入住时间
	 */
	private Date lastCtime;
	/**
	 * 最后一次预定时间
	 */
	private Date lastRtime;
	/**
	 * 备注
	 */
	private String note;

}
