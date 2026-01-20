package com.talhakoc.controller;

import com.talhakoc.dto.employee.request.EmployeeCreateDto;
import com.talhakoc.dto.employee.request.EmployeeUpdateDto;
import com.talhakoc.dto.employee.response.EmployeeDetailsDto;
import com.talhakoc.dto.employee.response.EmployeeDto;
import com.talhakoc.service.IEmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employee")
public class EmployeeController {

    private final IEmployeeService employeeService;

    @GetMapping("/list")
    public ResponseEntity<List<EmployeeDetailsDto>> listAll(){
        return ResponseEntity.ok(employeeService.listAll());
    }

    @PostMapping("/save")
    public ResponseEntity<EmployeeDto> save(@Valid @RequestBody EmployeeCreateDto employeeCreateDto) {
        return ResponseEntity.ok(employeeService.save(employeeCreateDto));
    }

    @PutMapping("/update")
    public ResponseEntity<EmployeeDto> update(@Valid @RequestBody EmployeeUpdateDto employeeUpdateDto) {
        return ResponseEntity.ok(employeeService.update(employeeUpdateDto));
    }

    @DeleteMapping("/delete/{uuid}")
    public ResponseEntity<String> delete(@PathVariable UUID uuid) {
        return ResponseEntity.ok(employeeService.delete(uuid));
    }
}
