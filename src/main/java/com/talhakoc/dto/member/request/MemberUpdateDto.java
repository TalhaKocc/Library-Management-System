package com.talhakoc.dto.member.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MemberUpdateDto {

    @Email(message = "Lütfen email formatında giriniz")
    @NotBlank(message = "Bu alan boş bırakılamaz")
    private String email;

    private String password;

    @NotBlank(message = "Bu alan boş bırakılamaz")
    private String fullName;

    @NotBlank(message = "Bu alan boş bırakılamaz")
    private String nationalId;

    @NotBlank(message = "Lütfen telefon numarası giriniz")
    @Pattern(regexp = "^[0-9]{10,11}$", message = "Telefon numarası 10-11 hane olmalıdır")
    private String phoneNumber;

    @NotBlank(message = "Bu alan boş bırakılamaz")
    private String address;

}
