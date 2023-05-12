package com.gmail.yeatz0408.backToshokan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.yeatz0408.backToshokan.dao.HistoryRepository;
import com.gmail.yeatz0408.backToshokan.entity.History;
import com.gmail.yeatz0408.backToshokan.requestmodels.AddBookRequest;
import com.gmail.yeatz0408.backToshokan.responsemodels.TopBookResponse;
import com.gmail.yeatz0408.backToshokan.service.AdminService;

@CrossOrigin("http://localhost:3000")
@RestController
public class TestController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private HistoryRepository historyRepo;

    @PostMapping("/addBook")
    public void postBook(@RequestBody AddBookRequest addBookRequest) throws Exception {
        adminService.postBook(addBookRequest);
    }

    @GetMapping("/topbooks")
    public List<Object> topbooks() {
        return historyRepo.findTopBooks();
    }

    
}
