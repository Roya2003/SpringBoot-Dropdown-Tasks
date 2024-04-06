package com.task.task.repository;

import com.task.task.dto.NationalityDDResponce;
import com.task.task.entity.NationalityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NationalityRepo extends JpaRepository<NationalityEntity,Long> {

    @Query(value = "SELECT * FROM fn_nationality_dropdown()",nativeQuery = true)
    List<NationalityDDResponce> getNationalityDropdown();
}
