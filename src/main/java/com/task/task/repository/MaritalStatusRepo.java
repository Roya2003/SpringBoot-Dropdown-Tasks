package com.task.task.repository;

import com.task.task.dto.MaritalStatusDDResponce;
import com.task.task.entity.MaritalSEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MaritalStatusRepo extends JpaRepository<MaritalSEntity,Long> {

    @Query(value = "SELECT * FROM fn_marital_status()",nativeQuery = true)
    List<MaritalStatusDDResponce> getMaritalStatusDropdown();
}
