/**
 * 
 */
package com.psm.bootcamp.case02.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import groovy.transform.builder.Builder;
import lombok.Data;

/**
 * @author Awiyanto Ajisasongko
 *
 */
@Data
@Builder
@Entity
@Table(name="T_CUST")
public class CustomerProfile {
	@Id
	@Column(name="CSID")
	private Integer id;
	
	@Column(name="CSNM")
	private String nama;
	
	@Column(name="CSADDR")
	private String alamat;

	@Column(name="CSBUSSCAT")
	private String kategoriBisnis = "UMUM";
}
