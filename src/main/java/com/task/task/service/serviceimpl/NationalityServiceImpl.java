package com.task.task.service.serviceimpl;

import com.task.task.apiResponse.ApiResponse;
import com.task.task.dto.NationalityDDResponce;
import com.task.task.dto.request.NationalityReqDto;
import com.task.task.entity.NationalityEntity;
import com.task.task.repository.NationalityRepo;
import com.task.task.service.NationalityService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class NationalityServiceImpl implements NationalityService {


    @Autowired
    private NationalityRepo nationalityRepo;



    @Override
    public ResponseEntity<?> getNationalityDropdown() {

        List<NationalityDDResponce> getNationalityData=nationalityRepo.getNationalityDropdown();

        return ResponseEntity.ok(getNationalityData);
    }

    @Override
    public ResponseEntity<?> saveNationality( NationalityReqDto nationalityReqDto) {
        ApiResponse response = new ApiResponse();
        NationalityEntity natilnality = new NationalityEntity();
        response.setMessage("nationality added Sucessfully");
        response.setResult("nationality Saved");
        natilnality.setDescription(nationalityReqDto.getNationality());
        natilnality.setId(natilnality.getId());
        nationalityRepo.save(natilnality);

        return ResponseEntity.ok(response);
    }



}
