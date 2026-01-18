package com.talhakoc.repository;

import com.talhakoc.model.BookStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookStatusRepository extends JpaRepository<BookStatus,Long> {
}
