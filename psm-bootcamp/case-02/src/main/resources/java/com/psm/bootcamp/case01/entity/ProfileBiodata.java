/**
 * 
 */
package com.psm.bootcamp.case01.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Awiyanto Ajisasongko
 *
 */
@Data
@Entity
@Table(name="T_BIODATA")
public class ProfileBiodata {
	@Id
	@Column(name="BDID")
	private Integer id;
	
	@Column(name="BDNM")
	private String nama;
	
	@Column(name="BDADDR")
	private String alamat;
}
