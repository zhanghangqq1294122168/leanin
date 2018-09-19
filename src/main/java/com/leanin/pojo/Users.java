package com.leanin.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Table(indexes = {@Index(columnList = "userId")})
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "userId", unique = true, nullable = false)
    private Long userId;
    private Timestamp timestamp;
    private String userCode;
    private String userName;
    private String userPassword;
    private Long userHospital;
    private Integer userState;
    private String userPhone;
    private Long userDept;
    private Long diningFloor;
    private String diningAddress;
    private Integer timeoutDining;
    private String openId;
    private Integer sex;
    private String patAddress;
    private String bedNo;
    private Date birthday;
    // 用户头像
    private String headImgUrl;

}