package com.leanin.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Table(indexes = {@Index(columnList = "orderId")})
public class OrderInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "orderId", unique = true, nullable = false)
    private Long orderId;
    private Long userId;
    private String customerName;
    private String customerDept;
    private String customerPhone;
    private Date diningDate;
    private Integer diningTime;
    private String diningFloor;
    private String diningAddress;
    private Date createTime;
    private Integer orderState;
    private String memo;
    private Long hospital;
    private Long sender;
    private Long navigationbarId;
    private Double diningMoney;
    private String inHospitalNo;
    private String bedNo;
    private Long operator;

}