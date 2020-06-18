package com.ysu.hotel.entity;


import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 消费信息
 */
@Data
public class Consume implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Integer id;
	/**
	 * 入住单号
	 */
	private String no;
	/**
	 * 房间号
	 */
	private String roomNumber;
	/**
	 * 商品名称
	 */
	private String goodsName;
	/**
	 * 数量
	 */
	private Integer number;
	/**
	 * 单价
	 */
	private BigDecimal goodsPrice;
	/**
	 * 消费金额
	 */
	private BigDecimal consumeMoney;
	/**
	 * 折扣率
	 */
	private BigDecimal discountRate;
	/**
	 * 折后金额
	 */
	private BigDecimal discountMoney;
	/**
	 * 合计
	 */
	private BigDecimal sumMoney;
	/**
	 * 操作员
	 */
	private Integer userId;
	/**
	 * 消费时间
	 */
	private Date date;
	/**
	 * 备注
	 */
	private String note;

}
