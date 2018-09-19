package com.leanin.pojo;

import lombok.Data;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Table(indexes = {@Index(columnList = "floorId")})
public class FoodNutrients implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "floorId", unique = true, nullable = false)
    private int foodId;  //营养Id
    private String foodName;  //原材料名称
    private String foodPower;  //能量/kal
    private String foodProtein;  //蛋白质
    private String foodFat;  //脂肪
    private String foodRetinol;  //视黄醇当量/微克
    private String foodFiber;   //纤维/克
    private String foodCaro;   //胡萝卜素/微克
    private String foodVA;     //VA/微克
    private String foodVB1;     //VB1/毫克
    private String foodVB2;         //VB2/毫克
    private String foodNiacin;     //烟酸/毫克
    private String foodVC;        //VC毫克
    private String foodVE;         //VE毫克
    private String foodPota;        //钾/毫克
    private String foodSodiu;    //钠/毫克
    private String foodCalci;      //钙/毫克
    private String foodMagn;    //镁/毫克
    private String foodIron;    //铁/毫克
    private String foodManga;   //锰/毫克
    private String foodZinc;   //锌/毫克
    private String foodCopper;  //铜/毫克
    private String foodPhos;   //磷/毫克
    private String foodSele;   //硒/微克

}
