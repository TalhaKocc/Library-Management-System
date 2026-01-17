package com.talhakoc.dto.employee.request;

import com.talhakoc.model.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeCreateDto {

    @NotBlank(message = "Bu alan boş bırakılamaz")
    private String username;

    @Email(message = "Lütfen email formatında giriniz")
    @NotBlank(message = "Bu alan boş bırakılamaz")
    private String email;

    private String password;

    @NotNull(message = "Bu alan boş bırakılamaz")
    private Role role;

    @NotBlank(message = "Bu alan boş bırakılamaz")
    private String fullName;

    @NotBlank(message = "Lütfen telefon numarası giriniz")
    @Pattern(regexp = "^[0-9]{10,11}$", message = "Telefon numarası 10-11 hane olmalıdır")
    private String phoneNumber;

}
