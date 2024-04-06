package com.task.task.service.serviceimpl;

import com.task.task.apiResponse.ApiResponse;
import com.task.task.dto.PinAllDDResponce;
import com.task.task.dto.PincodeDDResponce;
import com.task.task.dto.request.PinReqDto;
import com.task.task.entity.PincodeEntity;
import com.task.task.repository.PincodeRepo;
import com.task.task.service.PincodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PincodeServiceImpl implements PincodeService {
    @Autowired
    private PincodeRepo pincodeRepo;

    @Override
    public ResponseEntity<?> getPincode(Long pinCode) {
        ApiResponse response = new ApiResponse();
        List<PincodeDDResponce> getPincodeData = pincodeRepo.getPincode(pinCode);
        response.setMessage("Pincode fetch successfully");
        response.setResult(getPincodeData);
        return ResponseEntity.ok(response);
    }
    @Override
    public ResponseEntity<?> getAllPincode() {
        List<PinAllDDResponce> getAllPin = pincodeRepo.getPincode();
        return ResponseEntity.ok(getAllPin);
    }
    @Override
    public ResponseEntity<?> savePin(PinReqDto pinReqDto){
        ApiResponse response = new ApiResponse();
        PincodeEntity pin = new PincodeEntity();

                pin.setCity(pinReqDto.getCity());
                pin.setDescription(pinReqDto.getPinCode());
                pincodeRepo.save(pin);
                response.setMessage("Pincode Added Successfully");
                response.setResult(pin);
                return ResponseEntity.ok(response);

    }

}
