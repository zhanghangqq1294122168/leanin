package com.leanin.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Table(indexes = {@Index(columnList = "dcId")})
public class Dishclassify implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "dcId", unique = true, nullable = false)
    private Long dcId;
    private Date timestamp;
    private String dcName;
    private String creator;
    private Date createTime;
    private Integer dcState;
    private Long hospital;

}