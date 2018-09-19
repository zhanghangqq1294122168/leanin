package com.leanin.pojo;

import lombok.Data;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Data
@Table(indexes = {@Index(columnList = "hospitalId")})
public class Hospital implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "hospitalId", unique = true, nullable = false)
    private Long hospitalId;
    private String hospitalName;
    private String hospitalLable;
    private String appId;
    private String appSecret;
    private String thirdSysId;

}