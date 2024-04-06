package com.task.task.service.serviceimpl;

import com.task.task.apiResponse.ApiResponse;
import com.task.task.dto.TalukaDDResponce;
import com.task.task.dto.request.TalukaRequestDto;
import com.task.task.entity.TalukaEntity;
import com.task.task.repository.TalukaRepo;
import com.task.task.service.TalukaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TalukaServiceImpl implements TalukaService {
    @Autowired
    private TalukaRepo talukaRepo;



    @Override
    public ResponseEntity<?> getTalukaDropdown(Long districtId)  {
        ApiResponse response= new ApiResponse();
        List<TalukaDDResponce> getTaluka= talukaRepo.gettalukaDropdown(districtId);

             response.setMessage("Your Taluka Will Be Added Sucessfully");
             response.setResult("Taluka Saved");

        return ResponseEntity.ok(getTaluka);
    }

    @Override
    public ResponseEntity<?> saveTaluka(TalukaRequestDto talukaRequestDto) {


        ApiResponse response = new ApiResponse();

        if (talukaRequestDto.getId()==null){
            TalukaEntity taluka = new TalukaEntity();
            taluka.setDescription(talukaRequestDto.getTalukaName());
            taluka.setDistrict(talukaRequestDto.getDistrict());
            talukaRepo.save(taluka);
        }else {
            TalukaEntity taluka = talukaRepo.findById(talukaRequestDto.getId()).orElseThrow(()-> new IllegalArgumentException("Taluka Not Found "+talukaRequestDto.getTalukaName()));
            taluka.setDescription(talukaRequestDto.getTalukaName());
            taluka.setDistrict(talukaRequestDto.getDistrict());
            talukaRepo.save(taluka);
        }

        response.setMessage(" Your Taluka Will Be Added Sucessfully");
        response.setResult("Taluka Saved");
        return ResponseEntity.ok(response);
    }
}
