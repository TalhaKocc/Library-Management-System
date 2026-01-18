package com.talhakoc.dto.bookstatus.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookStatusCreateDto {

    @NotNull
    private Long bookId;

    @NotNull
    private Long memberId;

    @NotBlank(message = "Bu alan boş bırakılamaz")
    private LocalDate borrowDate;

    @NotBlank(message = "Bu alan boş bırakılamaz")
    private LocalDate returnDate;

}
