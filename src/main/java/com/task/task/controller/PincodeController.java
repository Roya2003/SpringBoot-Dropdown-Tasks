package com.task.task.controller;

import com.task.task.dto.PinAllDDResponce;
import com.task.task.dto.request.PinReqDto;
import com.task.task.service.PincodeService;
import jakarta.validation.Valid;
import org.hibernate.boot.model.internal.CreateKeySecondPass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/pincode")

public class PincodeController {

    @Autowired
    private PincodeService pincodeService;

    @GetMapping("/getPin/{pinCode}")
    public ResponseEntity<?> getPincodeData(@PathVariable Long pinCode)  {
        return pincodeService.getPincode(pinCode);

    }

    @GetMapping("/getAllPin")
    public ResponseEntity<?> getAllPin(){
        return pincodeService.getAllPincode();
    }


    @PostMapping("/savePincode")
    public ResponseEntity<?> savePin (@Valid @RequestBody PinReqDto pinReqDto){
        return pincodeService.savePin(pinReqDto);
    }


}
