package com.talhakoc.service.impl;

import com.talhakoc.dto.employee.request.EmployeeCreateDto;
import com.talhakoc.dto.employee.request.EmployeeUpdateDto;
import com.talhakoc.dto.employee.response.EmployeeDetailsDto;
import com.talhakoc.dto.employee.response.EmployeeDto;
import com.talhakoc.mapper.EmployeeMapper;
import com.talhakoc.repository.EmployeeRepository;
import com.talhakoc.repository.UserRepository;
import com.talhakoc.service.IEmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class EmployeeServiceImpl implements IEmployeeService {

    private final UserRepository userRepository;
    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    @Override
    public List<EmployeeDetailsDto> listAll() {
        return employeeRepository.findAll()
                .stream()
                .map(employeeMapper ::detailsToDto)
                .toList();
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
