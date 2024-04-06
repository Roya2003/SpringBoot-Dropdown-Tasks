package com.task.task.repository;

import com.task.task.dto.IdentificationDocDDResponce;
import com.task.task.dto.MaritalStatusDDResponce;
import com.task.task.entity.IdentificationDEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IdentificationDRepo extends JpaRepository<IdentificationDEntity,Long> {

    @Query(value = "SELECT * FROM fn_idetification_doc()",nativeQuery = true)
    List<IdentificationDocDDResponce> getIdentificationDoc();
}
