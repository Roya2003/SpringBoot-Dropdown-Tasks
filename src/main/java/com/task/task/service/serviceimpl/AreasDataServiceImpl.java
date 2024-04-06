package com.task.task.service.serviceimpl;

import com.task.task.apiResponse.ApiResponse;
import com.task.task.dto.AreasDataDto;
import com.task.task.repository.AreasDataRepo;
import com.task.task.service.AreasDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AreasDataServiceImpl implements AreasDataService {

    @Autowired
    private AreasDataRepo areasDataRepo;


    @Override
    public ResponseEntity<?> getAreasData() {
        ApiResponse response = new ApiResponse();
        List<AreasDataDto> getData = areasDataRepo.getAreasData();

        response.setMessage("data fetch sucessfully");
        response.setResult(getData);

        return ResponseEntity.ok(response);
    }
}
