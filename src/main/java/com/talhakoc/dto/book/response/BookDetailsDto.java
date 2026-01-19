package com.talhakoc.dto.book.response;

import com.talhakoc.model.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDetailsDto{

    private String name;

    private LocalDate publishDate;

    private Status status;

}

