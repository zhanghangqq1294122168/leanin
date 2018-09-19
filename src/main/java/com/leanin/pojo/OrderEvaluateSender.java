package com.leanin.pojo;

import lombok.Data;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Table(indexes = {@Index(columnList = "orderId")})
public class OrderEvaluateSender implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "orderId", unique = true, nullable = false)
    private Long orderId;
    private Integer evaluateStar;
    private String evaluateDesc;

}