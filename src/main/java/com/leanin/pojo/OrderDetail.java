package com.leanin.pojo;

import lombok.Data;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Table(indexes = {@Index(columnList="detailId")})
public class OrderDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "detailId", unique = true, nullable = false)
	private Long detailId;
	private Long orderId;
	private Long dcId;
	private Long dishId;
	private Long navigationbarId;
	private Double diningSum;
	private Double dishPrice;
	private Double diningMoney;

}