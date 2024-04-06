package com.task.task.repository;

import com.task.task.dto.AreasDataDto;
import com.task.task.entity.AreasDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AreasDataRepo extends JpaRepository<AreasDataEntity,Long> {

    @Query(value = "SELECT * FROM fn_area_data()",nativeQuery = true)
    List<AreasDataDto> getAreasData();
}
