package com.trans;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Data
@Table(name="usert")
public class user {
	 @Id
//	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id;
	    private String name;
	    @Transient
	    private Date tm;
}
