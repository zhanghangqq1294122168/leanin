package com.leanin.pojo;

import lombok.Data;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * @author scw
 * @create 2018-01-18 17:11
 * @desc 对于微信用户本身存在的信息的一个javabean，不需要在数据库中进行处理
 **/
@Entity
@Data
@Table(indexes = {@Index(columnList = "id")})
public class WeiXinUser implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    private Long hospitalId;
    // 用户的标识
    private String openId;
    // 关注状态（1是关注，0是未关注），未关注时获取不到其余信息  
    private int subscribe;
    // 用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间  
    private String subscribeTime;
    // 昵称  
    private String nickname;
    // 用户的性别（1是男性，2是女性，0是未知）  
    private int sex;
    // 用户所在国家  
    private String country;
    // 用户所在省份  
    private String province;
    // 用户所在城市  
    private String city;
    // 用户的语言，简体中文为zh_CN  
    private String language;
    // 用户头像  
    private String headImgUrl;

}  
