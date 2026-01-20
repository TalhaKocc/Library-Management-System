package com.talhakoc.service;

import com.talhakoc.dto.employee.request.EmployeeCreateDto;
import com.talhakoc.dto.employee.request.EmployeeUpdateDto;
import com.talhakoc.dto.employee.response.EmployeeDetailsDto;
import com.talhakoc.dto.employee.response.EmployeeDto;

import java.util.List;
import java.util.UUID;

public interface IEmployeeService {

    List<EmployeeDetailsDto> listAll();

    EmployeeDto save(EmployeeCreateDto employeeCreateDto);

    EmployeeDto update(EmployeeUpdateDto employeeUpdateDto);

    String delete(UUID uuid);
}
