package com.sxx.controller;

import com.sxx.controller.utils.Protocol;
import com.sxx.pojo.Staff;
import com.sxx.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author SHIXINXI
 * @create 2023-02-24-16:37
 */

@CrossOrigin("http://localhost:8080")
@RestController
@RequestMapping("/em/staff")
public class StaffController {

    @Autowired
    private IStaffService staffService;

    @GetMapping("{id}")
    public Protocol getStaffById(@PathVariable Integer id){
        return new Protocol(true,staffService.getById(id));
    }
    @GetMapping
    public Protocol getAllStaff(){
        return new Protocol(true,staffService.list());
    }
    @DeleteMapping("{id}")
    public Protocol DeleteStaffById(@PathVariable Integer id){
        return new Protocol(true,staffService.removeById(id));
    }
    @PostMapping
    public Protocol AddStaff(@RequestBody Staff staff){
        return new Protocol(true,staffService.save(staff));
    }
}
