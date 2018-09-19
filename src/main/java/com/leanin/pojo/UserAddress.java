package com.leanin.pojo;

import lombok.Data;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Table(indexes = {@Index(columnList = "addressId")})
public class UserAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "addressId", unique = true, nullable = false)
    private Long addressId;
    private Long userId;
    private String address;
    private Integer logout;
    private Integer defaultAddress;

}