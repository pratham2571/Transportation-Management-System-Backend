package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.model.Farmer;

public interface FarmerRepository extends JpaRepository<Farmer ,Integer>
{

	@Query("Select f from Farmer f where f.femailId=:femailId")
	Farmer findFarmerByEmail(@Param("femailId") String email);

	@Query("Select f from Farmer f where f.femailId=:femailId And f.farmerPassword=:farmerPassword")
	Farmer findByEmailIdAndPassword(@Param("femailId")String email ,@Param("farmerPassword")String password);

}
