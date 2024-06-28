package com.emiyaconsulting.springbootlibrary.dao;

import com.emiyaconsulting.springbootlibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}
