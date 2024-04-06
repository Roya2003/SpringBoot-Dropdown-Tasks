package com.task.task.repository;

import com.task.task.dto.BloodGroupDDResponce;
import com.task.task.entity.BloodGroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BloodGroupRepo extends JpaRepository<BloodGroupEntity,Long> {

    @Query(value = "SELECT * FROM fn_blood_group_dropdown()",nativeQuery = true)
    List<BloodGroupDDResponce> getBloodGroupDropdown();



}
