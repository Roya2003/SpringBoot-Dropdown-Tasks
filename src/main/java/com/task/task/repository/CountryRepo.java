package com.task.task.repository;

import com.task.task.dto.CountryDDResopnce;
import com.task.task.dto.IdentificationDocDDResponce;
import com.task.task.entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryRepo extends JpaRepository<CountryEntity,Long> {

    @Query(value = "SELECT * FROM fn_country_dropdown() ",nativeQuery = true)
    List<CountryDDResopnce> getCountryDropdown();


}
