package com.talhakoc.dto.book.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.boot.internal.Abstract;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookUpdateDto {

    @NotBlank(message = "Bu alan boş bırakılamaz")
    private String name;

    @NotNull
    private Long authorId;

    @NotNull
    private Long categoryId;

    @NotBlank(message = "Bu alan boş bırakılamaz")
    private LocalDate publishDate;

}
