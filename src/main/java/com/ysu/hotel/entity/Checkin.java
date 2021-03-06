package com.ysu.hotel.entity;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 入住登记
 */
@Data
public class Checkin implements Serializable {
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
	 * 房号
	 */
	private String roomNumber;
	/**
	 * 客房类型
	 */
	private Integer roomTypeId;
	/**
	 * 标准价
	 */
	private BigDecimal standardPrice;
	/**
	 * 折后价
	 */
	private BigDecimal discountPrice;
	/**
	 * 押金
	 */
	private BigDecimal deposit;
	/**
	 * 入住人
	 */
	private String customerName;
	/**
	 * 1身份证2护照3军官证
	 */
	private Integer cardType;
	/**
	 * 证件号
	 */
	private String cardNumber;
	/**
	 * 联系电话
	 */
	private String phone;
	/**
	 * 到店时间
	 */
	private Date arriveTime;
	/**
	 * 离店时间
	 */
	private Date leaveTime;
	/**
	 * 入住人数
	 */
	private Integer customerSize;
	/**
	 * 操作员id
	 */
	private Integer userId;
	/**
	 * 会员编号
	 */
	private Integer customerId;
	/**
	 * 会员价格
	 */
	private BigDecimal customerPrice;
	/**
	 * 1提供 0不提供
	 */
	private Integer breakfastOrNot;
	/**
	 * 1提供 0不提供
	 */
	private Integer remindOrNot;
	/**
	 * 备注
	 */
	private String note;

}
