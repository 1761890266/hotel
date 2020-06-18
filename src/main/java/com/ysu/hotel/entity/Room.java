package com.ysu.hotel.entity;


import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 房间信息
 *
 */
@Data
public class Room implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Integer id;
	/**
	 * 房号
	 */
	private String roomNumber;
	/**
	 * 1入住 2空闲 3预定
	 */
	private Integer state;
	/**
	 * 标准价
	 */
	private BigDecimal standardPrice;
	/**
	 * 折后价
	 */
	private BigDecimal discountPrice;
	/**
	 * 普通会员价
	 */
	private BigDecimal ncustomerPrice;
	/**
	 * VIP会员价
	 */
	private BigDecimal vcustomerPrice;
	/**
	 * 备注
	 */
	private String note;

}
