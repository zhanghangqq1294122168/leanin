package com.leanin.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Table(indexes = {@Index(columnList = "adviceId")})
public class Advice implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "adviceId", unique = true, nullable = false)
    private Long adviceId;
    private int adviceType;
    private String adviceName;
    private int logout;
    private Long hospital;
    private String adviceText;

}