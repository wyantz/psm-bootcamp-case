/**
 * 
 */
package com.psm.bootcamp.case02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psm.bootcamp.case02.entity.CustomerProfile;

/**
 * @author Awiyanto Ajisasongko
 *
 */
@Repository
public interface CustomerProfileRepository extends JpaRepository<CustomerProfile, Integer> {

}
