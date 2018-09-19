package com.leanin.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Table(indexes = {@Index(columnList = "id")})
public class Cookbook implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private long id; //主键
    private String bookDate;  //日期
    private long navigationbarId;  //餐次分类Id
    private long dishId;   //食品Id
    private long hospital;   //医院Id
    private long adviceId;  //医嘱Id
}
