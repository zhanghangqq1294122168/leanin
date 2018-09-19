package com.leanin.pojo;

import lombok.Data;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Data
@Table(indexes = {@Index(columnList = "userId")})
public class Courier implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "userId", unique = true, nullable = false)
    private Long userId;
    private String userName;
    private String userPhone;
    private Long userHospital;

}