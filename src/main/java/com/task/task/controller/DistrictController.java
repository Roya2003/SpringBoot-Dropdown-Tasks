package com.task.task.controller;

import com.task.task.dto.DistrictDDResponce;
import com.task.task.dto.request.DistrictReqDto;
import com.task.task.entity.DistrictEntity;
import com.task.task.service.DistrictService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/District")
public class DistrictController {
    @Autowired
    private DistrictService districtService;

     @GetMapping("/getDistrict/{stateId}")
    public ResponseEntity<?> getDistrict( @PathVariable Long stateId){
        return districtService.getDistrictDropdown(stateId);
    }

    @PostMapping("/saveDistrict")
    public ResponseEntity<?> saveDistrict(@Valid @RequestBody DistrictReqDto districtReqDto){
        return districtService.getDistrict(districtReqDto);
    }
}
