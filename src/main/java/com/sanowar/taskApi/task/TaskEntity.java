package com.sanowar.taskApi.task;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Md. Sanowar Ali
 *
 */

@Getter
@Setter
@Entity
@Table(name = "to_do")
public class TaskEntity implements Serializable{

	private static final long serialVersionUID = -4538971070304943261L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name = "todo_no")
	private Long id;
	
	@NotNull
	@Column(name = "start_date")
	private Date startDate;
	
	@NotNull
	@Column(name = "end_date")
	private Date endDate;
	
	@NotNull
	@Column(name = "item_name")
	private String itemName;

	@Column(name = "description")
	private String description;
	  
}
