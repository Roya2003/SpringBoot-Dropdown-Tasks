package com.task.task.service.serviceimpl;

import com.task.task.apiResponse.ApiResponse;
import com.task.task.dto.StateAllDDResponce;
import com.task.task.dto.StateDDResopnce;
import com.task.task.dto.request.StateReqDto;
import com.task.task.entity.StateEntity;
import com.task.task.repository.StateRepo;
import com.task.task.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateServiceImpl implements StateService {

    @Autowired
    private StateRepo stateRepo;

    @Override
    public ResponseEntity<?> getStateDropdown(Long countryId)  {
        List<StateDDResopnce> getState = stateRepo.getStateDropdown(countryId);
      ApiResponse response = new ApiResponse();

        response.setMessage("Your State Will Be Added Sucessfully");
        response.setResult("State Saved.");
        return ResponseEntity.ok(getState);
    }

    @Override
    public ResponseEntity<?> getAllstate() {
        List<StateAllDDResponce> getstate =stateRepo.getStateAll();
        return ResponseEntity.ok(getstate) ;
    }

    @Override
    public ResponseEntity<?> saveState(StateReqDto stateReqDto) {
        ApiResponse response = new ApiResponse();
           if (stateReqDto.getId()==null){
               StateEntity states =new StateEntity();
               states.setDescription(stateReqDto.getStateName());
               states.setCountry(stateReqDto.getCountry());
               stateRepo.save(states);
           }else {
               StateEntity states = stateRepo.findById(stateReqDto.getId()).orElseThrow(()->new IllegalArgumentException("State not Found"+stateReqDto.getId()));
               states.setDescription(stateReqDto.getStateName());
               states.setCountry(stateReqDto.getCountry());
               stateRepo.save(states);
           }
            response.setMessage("Your State Will Be Added Sucessfully");
            response.setResult("State Saved.");
            return ResponseEntity.ok(response);
    }


}
