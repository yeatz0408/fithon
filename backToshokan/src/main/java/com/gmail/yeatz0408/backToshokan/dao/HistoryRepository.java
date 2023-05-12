package com.gmail.yeatz0408.backToshokan.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import com.gmail.yeatz0408.backToshokan.entity.Book;
import com.gmail.yeatz0408.backToshokan.entity.History;
import com.gmail.yeatz0408.backToshokan.responsemodels.TopBookResponse;

public interface HistoryRepository extends JpaRepository<History, Long> {

    Page<History> findBooksByUserEmail(@RequestParam("email") String userEmail, Pageable pageable);

    @Query(value = "SELECT title, COUNT(title) AS count FROM history GROUP BY title ORDER BY count DESC", nativeQuery = true)
    List<Object> findTopBooks();
    

}
