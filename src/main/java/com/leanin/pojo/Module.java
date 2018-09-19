package com.leanin.pojo;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Table(name = "module", catalog = "dc", uniqueConstraints = {
        @UniqueConstraint(columnNames = "modulePage"),
        @UniqueConstraint(columnNames = "moduleCode"),
        @UniqueConstraint(columnNames = "moduleName")}, indexes = {@Index(columnList = "moduleId")})
public class Module implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "moduleId", unique = true, nullable = false)
    private Long moduleId;
    private Timestamp timestamp;
    private String moduleName;
    private String moduleCode;
    private String moduleSuperCode;
    private String modulePage;
    private Integer moduleLevel;

}