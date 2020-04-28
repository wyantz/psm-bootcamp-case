package com.psm.bootcamp.case02.test;

import org.junit.Assert;
import org.junit.Test;

import com.psm.bootcamp.case02.entity.CustomerProfile;
import com.psm.bootcamp.case02.service.HitungLuasService;

public class CustomerProfileTest {
	
	@Test
	public void testCustomerProfileCategoryNull() {
		CustomerProfile cp = new CustomerProfile();
		/*
		 * 
		 */
		Assert.assertNotNull(cp.getKategoriBisnis());
		
	}
	
	@Test
	public void hitungLuasSegitiga() {
		double luas = HitungLuasService.hitungLuasSegitiga(10,10);
		Assert.assertTrue(luas>0);
		Assert.assertEquals(new Double(50), new Double(luas));		
	}
}
