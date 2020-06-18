package com.ysu.hotel.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 客房类型
 *
 */
@Data
public class Roomtype implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Integer id;
	/**
	 * 客房名称
	 */
	private String name;
	/**
	 * 额定人数
	 */
	private Integer size;
	/**
	 * 备注
	 */
	private String note;

}
