package com.task.task.repository;

import com.task.task.dto.DistrictDDResponce;
import com.task.task.entity.DistrictEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DistrictRepo extends JpaRepository<DistrictEntity,Long> {

    @Query(value = "SELECT * FROM fn_district_dropdown(:stateId)",nativeQuery = true)
    List<DistrictDDResponce> getDistrictDropdown(Long stateId);
}
