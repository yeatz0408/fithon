package com.gmail.yeatz0408.backToshokan.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import com.gmail.yeatz0408.backToshokan.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
    Page<Book> findByTitleContaining(@RequestParam("title") String title, Pageable pageable);
}