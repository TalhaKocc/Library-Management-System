package com.talhakoc.mapper;

import com.talhakoc.dto.employee.request.EmployeeCreateDto;
import com.talhakoc.dto.employee.request.EmployeeUpdateDto;
import com.talhakoc.dto.employee.response.EmployeeDetailsDto;
import com.talhakoc.dto.employee.response.EmployeeDto;
import com.talhakoc.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface EmployeeMapper {

    EmployeeDto toDto(Employee employee);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user", ignore = true)
    Employee toCreateEntity(EmployeeCreateDto employeeCreateDto);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user", ignore = true)
    Employee toUpdateEntity(EmployeeUpdateDto employeeUpdateDto, @MappingTarget Employee employee);

    EmployeeDetailsDto detailsToDto(Employee employee);

}
