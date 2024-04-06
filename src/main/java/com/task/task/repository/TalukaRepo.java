package com.task.task.repository;


import com.task.task.dto.TalukaDDResponce;
import com.task.task.entity.TalukaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TalukaRepo extends JpaRepository<TalukaEntity,Long> {
    @Query(value = "SELECT * FROM fn_taluka_dropdown(:districtId)",nativeQuery = true)
    List<TalukaDDResponce> gettalukaDropdown(Long districtId);
}