package com.leanin.pojo;

import lombok.Data;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Table(indexes = {@Index(columnList = "navigationbarId")})
public class NavigationBar implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "navigationbarId", unique = true, nullable = false)
    private Long navigationbarId;
    private String navigationbarName;
    private int logout;
    private Long hospital;

}