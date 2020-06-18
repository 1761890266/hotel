package com.ysu.hotel.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 楼层信息
 *
 */
@Data
public class Floor implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Integer id;
	/**
	 * 楼层名称
	 */
	private String name;
	/**
	 * 备注
	 */
	private String note;

}
