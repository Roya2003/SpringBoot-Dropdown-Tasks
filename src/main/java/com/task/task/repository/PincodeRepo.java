
package com.task.task.repository;

import com.task.task.dto.PinAllDDResponce;
import com.task.task.dto.PincodeDDResponce;
import com.task.task.entity.PincodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PincodeRepo extends JpaRepository<PincodeEntity,Long> {

    @Query(value = "SELECT * FROM fn_pincode_dropdown(?)",nativeQuery = true)
    List<PincodeDDResponce> getPincode(Long pinCode);

    @Query(value = "SELECT * FROM fn_pinAll_dropdown()",nativeQuery = true)
    List<PinAllDDResponce> getPincode();


}