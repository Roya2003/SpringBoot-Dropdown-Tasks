package com.task.task.repository;

import com.task.task.dto.StateAllDDResponce;
import com.task.task.dto.StateDDResopnce;
import com.task.task.entity.StateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StateRepo extends JpaRepository<StateEntity,Long> {

    @Query(value ="SELECT * FROM fn_state_dropdown(:countryId)", nativeQuery = true)
    List<StateDDResopnce> getStateDropdown(Long countryId);

    @Query(value ="SELECT * FROM fn_stateAll_dropdown()", nativeQuery = true)
    List<StateAllDDResponce> getStateAll();


}