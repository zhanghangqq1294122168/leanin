package com.leanin.pojo;

import lombok.Data;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Data
@Table(indexes = {@Index(columnList = "bedId")})
public class Bed implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "bedId", unique = true, nullable = false)
    private Long bedId;
    private String bedNo;
    private Long deptId;
    private Integer logout;
}