package com.task.task.service.serviceimpl;
import com.task.task.apiResponse.ApiResponse;
import com.task.task.dto.BloodGroupDDResponce;
import com.task.task.dto.request.BloodGroupDto;
import com.task.task.entity.BloodGroupEntity;
import com.task.task.repository.BloodGroupRepo;
import com.task.task.service.BloodGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BloodGroupServiceImpl implements BloodGroupService {
    @Autowired
    private BloodGroupRepo bloodGroupRepo;
    @Override
    public ResponseEntity<?> getBloodGroupDropdown() {
        List<BloodGroupDDResponce> getBloodGroup=bloodGroupRepo.getBloodGroupDropdown();
        ApiResponse response=new ApiResponse();
        response.setMessage("BloodGroup fetch sucessfully");
        response.setResult(getBloodGroup);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<?> saveBloodGroup(BloodGroupDto bloodGroupDto) {
        ApiResponse response = new ApiResponse();
        BloodGroupEntity bloodGroup = new BloodGroupEntity();
        response.setMessage(" Your BloodGroup Will Be Added Sucessfully");
        response.setResult("BloodGroup Saved");
        bloodGroup.setDescription(bloodGroupDto.getBloodGroup());
        bloodGroup.setId(bloodGroup.getId());
        bloodGroupRepo.save(bloodGroup);
        return ResponseEntity.ok(response);
    }


}
