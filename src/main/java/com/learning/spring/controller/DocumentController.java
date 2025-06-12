package com.learning.spring.controller;

import com.learning.spring.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @GetMapping("check")
    public String checkDetails(){
        return documentService.getDetails();
    }
}
