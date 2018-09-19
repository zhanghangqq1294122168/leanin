package com.leanin.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "roleLabel"), indexes = {@Index(columnList = "roleId")})
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "roleId", unique = true, nullable = false)
    private Long roleId;
    private Timestamp timestamp;
    private Long roleHospital;
    private String roleName;
    private String roleDescription;
    private String roleLabel;
    private Timestamp createTime;
    private String creator;
    private int roleType;

}