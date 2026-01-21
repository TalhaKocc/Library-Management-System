package com.talhakoc.mapper;

import com.talhakoc.dto.employee.response.EmployeeDetailsDto;
import com.talhakoc.dto.member.request.MemberCreateDto;
import com.talhakoc.dto.member.request.MemberUpdateDto;
import com.talhakoc.dto.member.response.MemberDto;
import com.talhakoc.model.Employee;
import com.talhakoc.model.Member;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring",  uses = {UserMapper.class})
public interface MemberMapper {

    MemberDto toDto(Member member);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user", ignore = true)
    Member toCreateEntity(MemberCreateDto memberCreateDto);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user", ignore = true)
    Member toUpdateEntity(MemberUpdateDto memberUpdateDto, @MappingTarget Member member);

    EmployeeDetailsDto detailsToDto(Employee employee);
}
