package com.task.task.service.serviceimpl;

import com.task.task.apiResponse.ApiResponse;
import com.task.task.dto.IsdDDResponce;
import com.task.task.dto.request.IsdNoDto;
import com.task.task.entity.ISDEntity;
import com.task.task.repository.IsdRepo;
import com.task.task.service.IsdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IsdServiceImpl implements IsdService {

    @Autowired
    private IsdRepo isdRepo;
    @Override
    public ResponseEntity<?> getISdDropdown() {
        List<IsdDDResponce> getIsd = isdRepo.getIsdDropdown();
        return ResponseEntity.ok(getIsd) ;
    }

    @Override
    public ResponseEntity<?> save(IsdNoDto isdNoDto) {
        ApiResponse response = new ApiResponse();
        ISDEntity Isd = new ISDEntity();

        response.setMessage("Your IsdNo Will Be Added Sucessfully");
        response.setResult(" IsdNo Saved ");

        Isd.setDescription(isdNoDto.getIsdNo());
        Isd.setId(isdNoDto.getIsdNo());
        isdRepo.save(Isd);

        return ResponseEntity.ok(response);

    }


}
