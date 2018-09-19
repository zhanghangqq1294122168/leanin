package com.leanin.pojo;

import lombok.Data;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Data
@Table(indexes = {@Index(columnList = "deptId")})
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "deptId", unique = true, nullable = false)
    private Long deptId;
    private String deptName;
    private Integer logout;

}