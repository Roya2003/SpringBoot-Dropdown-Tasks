package com.task.task.repository;

import com.task.task.dto.DistrictDDResponce;
import com.task.task.dto.IsdDDResponce;
import com.task.task.entity.ISDEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IsdRepo extends JpaRepository<ISDEntity,Long> {

    @Query(value = "SELECT * FROM fn_isd_dropdown()",nativeQuery = true)
    List<IsdDDResponce> getIsdDropdown();}
