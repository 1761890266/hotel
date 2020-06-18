package com.ysu.hotel.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品类别
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-06-17 09:03:12
 */
@Data
public class GoodsType implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Integer id;
	/**
	 * 类别名称
	 */
	private String name;
	/**
	 * 备注
	 */
	private String note;

}
