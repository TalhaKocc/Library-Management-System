package com.talhakoc.dto.login.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequestDto {

    @Email(message = "Lütfen email formatında giriniz")
    @NotBlank(message = "Bu alan boş bırakılamaz")
    private String username;

    @NotBlank(message = "Bu alan boş bırakılamaz")
    private String password;
}
