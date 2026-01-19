package com.talhakoc.dto.bookstatus.response;

import com.talhakoc.dto.book.response.BookDetailsDto;
import com.talhakoc.dto.member.response.MemberDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookStatusDto {

    private BookDetailsDto book;

    private MemberDto member;

    private LocalDate borrowDate;

    private LocalDate returnDate;
}
