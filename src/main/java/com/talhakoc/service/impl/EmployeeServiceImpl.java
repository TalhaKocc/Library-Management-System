package com.talhakoc.service.impl;

import com.talhakoc.dto.employee.request.EmployeeCreateDto;
import com.talhakoc.dto.employee.request.EmployeeUpdateDto;
import com.talhakoc.dto.employee.response.EmployeeDetailsDto;
import com.talhakoc.dto.employee.response.EmployeeDto;
import com.talhakoc.service.IEmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class EmployeeServiceImpl implements IEmployeeService {

    @Override
    public List<EmployeeDetailsDto> listAll() {
        return List.of();
    }

    @Override
    public EmployeeDto save(EmployeeCreateDto employeeCreateDto) {
        return null;
    }

    @Override
    public EmployeeDto update(EmployeeUpdateDto employeeUpdateDto) {
        return null;
    }

    @Override
    public String delete(UUID uuid) {
        return "";
    }
}
