package com.task.task.service.serviceimpl;

import com.task.task.apiResponse.ApiResponse;
import com.task.task.dto.PrefixDDResponce;
import com.task.task.dto.request.PrefixReqDto;
import com.task.task.entity.PrefixEntity;
import com.task.task.repository.PrefixRepo;
import com.task.task.service.PrefixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrefixServiceImpl implements PrefixService {
    @Autowired
    private PrefixRepo prefixRepo;
    @Override
    public ResponseEntity<?> getPreficDropdown() {
        List<PrefixDDResponce> getprefix = prefixRepo.getPrefixDropdown();
        ApiResponse responce = new ApiResponse();

        responce.setMessage("prefix fetch sucessfully");
        responce.setResult(getprefix);

        return ResponseEntity.ok(getprefix);
    }


    @Override
    public ResponseEntity<?> save(PrefixReqDto prefixReqDto) {
        ApiResponse response = new ApiResponse();
        PrefixEntity prefix = new PrefixEntity();

        prefix.setDescription(prefixReqDto.getPrefix());
        prefix.setId(prefix.getId());

        response.setMessage("prefix Added sucessfully");
        response.setResult("prefix Saved");

        prefixRepo.save(prefix);

        return ResponseEntity.ok(response);
    }




}
