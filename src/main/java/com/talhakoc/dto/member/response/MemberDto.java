package com.talhakoc.dto.member.response;

import com.talhakoc.dto.user.response.UserDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {

    private UserDto user;

    private String fullName;

}
