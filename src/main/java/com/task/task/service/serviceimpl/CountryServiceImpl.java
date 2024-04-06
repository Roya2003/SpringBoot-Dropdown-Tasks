package com.task.task.service.serviceimpl;

import com.task.task.apiResponse.ApiResponse;
import com.task.task.dto.CountryDDResopnce;
import com.task.task.dto.request.CountryRequestDto;
import com.task.task.entity.CountryEntity;
import com.task.task.repository.CountryRepo;
import com.task.task.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryRepo countryRepo;
    @Override
    public ResponseEntity<?> getCountryDropdown() {
        List<CountryDDResopnce> getCountry = countryRepo.getCountryDropdown();
        ApiResponse response=new ApiResponse();
        response.setMessage("country fetch sucessfully");
        response.setResult(getCountry);
        return ResponseEntity.ok(response);
    }

    @Override
    public CountryEntity save( CountryEntity countryEntity) {
        return countryRepo.save(countryEntity);
    }

    @Override
    public ResponseEntity<?> saveCountry(CountryRequestDto countryRequestDto) {
        ApiResponse response = new ApiResponse();
        if (countryRequestDto.getId()==null){
            CountryEntity country = new CountryEntity();
            country.setDescription(countryRequestDto.getCountryName());
            countryRepo.save(country);
        }else {
            CountryEntity country = countryRepo.findById(countryRequestDto.getId()).orElseThrow(()-> new IllegalArgumentException("country not found"+countryRequestDto.getId()));
            country.setDescription(countryRequestDto.getCountryName());
            countryRepo.save(country);
        }
             response.setMessage(" Your Country Will Be Added Sucessfully");
             response.setResult("Country Saved");
             return ResponseEntity.ok(response);
    }
}
