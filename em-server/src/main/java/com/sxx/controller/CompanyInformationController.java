package com.sxx.controller;

import com.sxx.controller.utils.Protocol;
import com.sxx.service.ICompanyInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SHIXINXI
 * @create 2023-03-27-9:22
 */
@CrossOrigin("http://localhost:8080")
@RestController
@RequestMapping("/em")
public class CompanyInformationController {

    @Autowired
    private ICompanyInformation companyInformation;

    @GetMapping("/et")
    public Protocol getEmployeesTotal(){
        return new Protocol(true,companyInformation.count());
    }
}
