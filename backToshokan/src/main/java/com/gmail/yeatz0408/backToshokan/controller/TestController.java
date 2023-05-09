package com.gmail.yeatz0408.backToshokan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.yeatz0408.backToshokan.requestmodels.AddBookRequest;
import com.gmail.yeatz0408.backToshokan.service.AdminService;
import com.gmail.yeatz0408.backToshokan.utils.ExtractJWT;

@CrossOrigin("http://localhost:3000")
@RestController
public class TestController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/addBook")
    public void postBook(@RequestBody AddBookRequest addBookRequest) throws Exception {
        adminService.postBook(addBookRequest);
    }
    
}
