package com.task.task.controller;

import com.task.task.dto.request.BloodGroupDto;
import com.task.task.service.BloodGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/bloodGroup/api")
public class BloodGroupController {

    @Autowired
    private BloodGroupService bloodGroupService;

    @GetMapping("/getbloodgroup")
    public ResponseEntity<?> getBloodGroupDropdown(){
        return bloodGroupService.getBloodGroupDropdown();
    }

    @PostMapping("/postbloodgroup")
    public ResponseEntity<?> save (@RequestBody BloodGroupDto bloodGroupDto){
        return bloodGroupService.saveBloodGroup(bloodGroupDto);
    }
}
