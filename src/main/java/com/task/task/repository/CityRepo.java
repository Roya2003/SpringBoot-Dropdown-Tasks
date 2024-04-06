package com.task.task.repository;

import com.task.task.dto.CityDDResponce;
import com.task.task.entity.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityRepo extends JpaRepository<CityEntity,Long> {



    @Query(value = "SELECT * FROM fn_city_dropdown(:talukaId)",nativeQuery = true)

    List<CityDDResponce> getCityDropdown(Long talukaId);

}
