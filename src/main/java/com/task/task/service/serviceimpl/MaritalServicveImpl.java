package com.task.task.service.serviceimpl;

import com.task.task.apiResponse.ApiResponse;
import com.task.task.dto.MaritalStatusDDResponce;
import com.task.task.dto.request.MaritalDto;
import com.task.task.entity.MaritalSEntity;
import com.task.task.entity.PincodeEntity;
import com.task.task.repository.MaritalStatusRepo;
import com.task.task.service.MaritalStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaritalServicveImpl implements MaritalStatusService {

    @Autowired
    private MaritalStatusRepo maritalStatusRepo;

    @Override
    public ResponseEntity<?> getMaritalStatusDropdown() {
        List<MaritalStatusDDResponce> getMarital = maritalStatusRepo.getMaritalStatusDropdown();
        return ResponseEntity.ok(getMarital);
    }

    @Override
    public ResponseEntity<?> saveMarital(MaritalDto maritalDto) {
        ApiResponse response = new ApiResponse();
        MaritalSEntity marital = new MaritalSEntity();

        response.setMessage("maritalStatus Added Successfully");
        response.setResult("saved maritalStatus");

        marital.setDescription(maritalDto.getMaritalStatus());
        marital.setId(marital.getId());
        maritalStatusRepo.save(marital);

        return ResponseEntity.ok(response);

    }


}
