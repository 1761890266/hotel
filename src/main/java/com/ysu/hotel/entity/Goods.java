package com.ysu.hotel.entity;


import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品信息
 *
 */
@Data
public class Goods implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Integer id;
	/**
	 * 商品名称
	 */
	private String name;
	/**
	 * 商品类别id
	 */
	private Integer goodsTypeId;
	/**
	 * 单价
	 */
	private BigDecimal price;
	/**
	 * 单位
	 */
	private String unit;
	/**
	 * 备注
	 */
	private String note;

}
