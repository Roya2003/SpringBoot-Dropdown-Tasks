package com.task.task.service.serviceimpl;

import com.task.task.apiResponse.ApiResponse;
import com.task.task.dto.request.EmployeeReqDto;
import com.task.task.entity.Department;
import com.task.task.entity.Employee;
import com.task.task.entity.EmployeeEmbeddedEntity;
import com.task.task.entity.EmployeePKId;
import com.task.task.repository.DepartmentRepo;
import com.task.task.repository.EmpDepMappingRepo;
import com.task.task.repository.EmployeeRepo;
import com.task.task.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private DepartmentRepo departmentRepo;

    @Autowired
    private EmpDepMappingRepo empDepMappingRepo;

    @Override
    public List<Employee> getEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public ResponseEntity<?> saveEmployee(EmployeeReqDto employeeReqDto) {

        ApiResponse api = new ApiResponse();

        //save emp
        Employee emp = new Employee();
        emp.setName(employeeReqDto.getName());
        emp.setCompanyName(employeeReqDto.getCompanyName());
        emp.setEmailId(employeeReqDto.getEmailId());
        emp.setAddress(employeeReqDto.getAddress());
        Employee saveEmp= employeeRepo.save(emp);

        //save dep
        Department dep = new Department();
        dep.setDepName(employeeReqDto.getDepName());
        Department saveDep = departmentRepo.save(dep);

        //save embemdded keys
        EmployeePKId employeePKId = new EmployeePKId();
        employeePKId.setEmployeeId(saveEmp);
        employeePKId.setDepertmentId(saveDep);

        EmployeeEmbeddedEntity employeeEmbeddedEntity = new EmployeeEmbeddedEntity();
        employeeEmbeddedEntity.setEmployeePKId(employeePKId);
        empDepMappingRepo.save(employeeEmbeddedEntity);


       api.setMessage("Employee data");
       api.setResult("OK");

        return ResponseEntity.ok(api);
    }

}
