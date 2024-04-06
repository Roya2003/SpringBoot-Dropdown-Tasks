package com.task.task.controller;

import com.task.task.apiResponse.ApiResponse;
import com.task.task.dto.request.StateReqDto;
import com.task.task.entity.StateEntity;
import com.task.task.service.StateService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/States")
public class StateController {
    @Autowired
    private StateService stateService;

    @GetMapping("/getState/{countryId}")
    public ResponseEntity<?> getstate(@PathVariable Long countryId){
        return stateService.getStateDropdown(countryId);
    }

    @GetMapping("/getAllState")
    public ResponseEntity<?> getAllstate(){
        return stateService.getAllstate();
    }


    @PostMapping("/saveState")
    public ResponseEntity<?> saveState(@Valid @RequestBody StateReqDto stateReqDto) {
        ApiResponse response= new ApiResponse();
        return stateService.saveState(stateReqDto);

    }
//    @PutMapping("/updateState/{stateId}")
//    public ResponseEntity<?> updateState(@PathVariable Long stateId, @Valid @RequestBody StateReqDto stateReqDto) {
//        return stateService.updateState(stateId, stateReqDto);
//    }
}
