package com.task.task.repository;

import com.task.task.dto.MaritalStatusDDResponce;
import com.task.task.dto.PrefixDDResponce;
import com.task.task.entity.PrefixEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PrefixRepo extends JpaRepository<PrefixEntity,Long> {
    @Query(value = "SELECT * FROM fn_prefix_dropdown()",nativeQuery = true)
    List<PrefixDDResponce> getPrefixDropdown();

}
