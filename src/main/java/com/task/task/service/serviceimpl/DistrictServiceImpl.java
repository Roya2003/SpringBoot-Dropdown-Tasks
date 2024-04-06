package com.task.task.service.serviceimpl;

import com.task.task.apiResponse.ApiResponse;
import com.task.task.dto.DistrictDDResponce;
import com.task.task.dto.request.DistrictReqDto;
import com.task.task.entity.DistrictEntity;
import com.task.task.repository.DistrictRepo;
import com.task.task.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {

    @Autowired
    private DistrictRepo districtRepo ;


    @Override
    public ResponseEntity<?> getDistrictDropdown(Long stateId)  {
        ApiResponse response = new ApiResponse();
        List<DistrictDDResponce> getdistrict=districtRepo.getDistrictDropdown(stateId);
         response.setMessage("Your State Will Be Added Sucessfully");
         response.setResult("State Saved.");
        return ResponseEntity.ok(getdistrict);
        }

    @Override
    public ResponseEntity<?> getDistrict(DistrictReqDto districtReqDto) {
        ApiResponse response = new ApiResponse();
        if(districtReqDto.getId()==null) {
            DistrictEntity distri = new DistrictEntity();
            distri.setDescription(districtReqDto.getDistrictName());
            distri.setState(districtReqDto.getState());
            districtRepo.save(distri);
        }else{
            DistrictEntity distri = districtRepo.findById(districtReqDto.getId()).orElseThrow(()-> new IllegalArgumentException("district not found"+districtReqDto.getId()));
            distri.setDescription(districtReqDto.getDistrictName());
            distri.setState(districtReqDto.getState());
            districtRepo.save(distri);
        }
        response.setStatusCode(HttpStatus.OK.value());
        response.setMessage("District Save Sucessfully");
        return ResponseEntity.ok(response);
    }



}
