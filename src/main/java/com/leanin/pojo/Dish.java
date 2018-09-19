package com.leanin.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Data
@Table(indexes = {@Index(columnList = "dishId")})
public class Dish implements Serializable, Comparable<Dish> {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "dishId", unique = true, nullable = false)
    private Long dishId;
    private Timestamp timestamp;
    private String dishName;
    private Double dishPrice;
    private String dishDesc;
    private String dishTime;
    private Long dcId;
    private Integer dishState;
    private Timestamp createTime;
    private String creator;
    private Long hospital;
    private String dishImg;


    @Override
    public int compareTo(Dish o) {
        // TODO Auto-generated method stub
        return this.getDishId().compareTo(o.getDishId());
    }

}