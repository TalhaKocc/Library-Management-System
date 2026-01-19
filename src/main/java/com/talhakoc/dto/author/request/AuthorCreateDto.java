package com.talhakoc.dto.author.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorCreateDto {

    @NotBlank(message = "Bu alan boş bırakılamaz")
    private String fullName;
}
