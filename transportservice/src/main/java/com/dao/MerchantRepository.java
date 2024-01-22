package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.model.Merchant;

public interface MerchantRepository extends JpaRepository<Merchant ,Integer>
{

	@Query("Select m from Merchant m where m.emailId=:emailId")
	Merchant findMerchantByEmail(@Param("emailId") String email);

	@Query("Select m from Merchant m where m.emailId=:emailId And m.merchantPassword=:merchantPassword")
	Merchant findByEmailIdAndPassword(@Param("emailId")String email ,@Param("merchantPassword")String password);

}
