package com.leanin.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Table(indexes = {@Index(columnList = "id")})
public class RoleModule implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    private Timestamp timestamp;
    private String roleLabel;
    private String moduleCode;
    private String mosuleSuperCode;
    private Boolean finds;
    private Boolean adds;
    private Boolean deletes;
    private Boolean modifys;

}