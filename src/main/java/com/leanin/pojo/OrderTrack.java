package com.leanin.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Table(indexes = {@Index(columnList="trackId")})
public class OrderTrack implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "trackId", unique = true, nullable = false)
	private Long trackId;
	private Long orderId;
	private Integer trackState;
	private Long trackUser;
	private Date trackDate;
	private Long sender;
	private Integer sendMessage;

}