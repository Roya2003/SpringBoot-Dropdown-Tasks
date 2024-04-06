package com.task.task.service.serviceimpl;

import com.task.task.apiResponse.ApiResponse;

import com.task.task.dto.CityDDResponce;
import com.task.task.dto.request.CityReqDto;
import com.task.task.entity.CityEntity;
import com.task.task.repository.CityRepo;
import com.task.task.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepo cityRepo;


    @Override
    public ResponseEntity<?> getCityDropdown(Long talukaId) {
        List<CityDDResponce> getCityData = cityRepo.getCityDropdown(talukaId);
        ApiResponse response=new ApiResponse();
            response.setMessage("TalukaId fetch sucessfully");
            response.setResult(getCityData);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<?> getCity(CityReqDto cityReqDto) {
        ApiResponse responce = new ApiResponse();
        if (cityReqDto.getId()==null){
            CityEntity cities = new CityEntity();
            cities.setDescription(cityReqDto.getCityName());
            cities.setTaluka(cityReqDto.getTaluka());
            cityRepo.save(cities);
        } else {
            CityEntity cities = cityRepo.findById(cityReqDto.getId()).orElseThrow(()->new IllegalArgumentException("City not Found"+ cityReqDto.getId()));
            cities.setDescription(cityReqDto.getCityName());
            cities.setTaluka(cityReqDto.getTaluka());
            cityRepo.save(cities);
        }
        responce.setMessage("City Added Sucesssfully");
        responce.setResult("City Saved");
        return ResponseEntity.ok(responce);
    }
}
