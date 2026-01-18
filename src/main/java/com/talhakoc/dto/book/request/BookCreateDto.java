package com.talhakoc.dto.book.request;

import com.talhakoc.model.Status;
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
public class BookCreateDto {

    @NotBlank(message = "Bu alan boş bırakılamaz")
    private String name;

    @NotNull
    private Long authorId;

    @NotNull
    private Long categoryId;

    @NotBlank(message = "Bu alan boş bırakılamaz")
    private LocalDate publishDate;

    @NotNull
    private Status status;

}
