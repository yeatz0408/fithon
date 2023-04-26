package com.gmail.yeatz0408.backToshokan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmail.yeatz0408.backToshokan.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}
