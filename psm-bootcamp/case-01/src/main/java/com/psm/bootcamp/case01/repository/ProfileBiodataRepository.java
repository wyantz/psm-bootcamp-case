/**
 * 
 */
package com.psm.bootcamp.case01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psm.bootcamp.case01.entity.ProfileBiodata;

/**
 * @author Awiyanto Ajisasongko
 *
 */
@Repository
public interface ProfileBiodataRepository extends JpaRepository<ProfileBiodata, Integer> {

}
