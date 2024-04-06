package com.task.task.service.serviceimpl;

import com.task.task.apiResponse.ApiResponse;
import com.task.task.dto.IdentificationDocDDResponce;
import com.task.task.dto.request.IdentificationDto;
import com.task.task.entity.IdentificationDEntity;
import com.task.task.repository.IdentificationDRepo;
import com.task.task.service.IdentificationDocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdentificationDocServiceImpl implements IdentificationDocService {
    @Autowired
    private IdentificationDRepo identificationDRepo;

    @Override
    public ResponseEntity<?> getIdentificationDoc() {
        List<IdentificationDocDDResponce> getDocument = identificationDRepo.getIdentificationDoc();
        ApiResponse response = new ApiResponse();
        response.setMessage("Identification Document Fetch Sucessfully");
        response.setResult(getDocument);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<?> SaveIdentification(IdentificationDto identificationDto) {
        ApiResponse response = new ApiResponse();
        IdentificationDEntity identity = new IdentificationDEntity();
        identity.setDescription(identificationDto.getIdentificationName());
        identity.setId(identity.getId());

        identificationDRepo.save(identity);
        response.setMessage("IdentificationName Added Successfully");
        response.setResult("saved IdentificationName");

        return ResponseEntity.ok(response);

    }

}
