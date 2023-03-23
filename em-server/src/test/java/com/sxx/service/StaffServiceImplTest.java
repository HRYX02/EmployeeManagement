package com.sxx.service;

import com.sxx.pojo.Staff;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author SHIXINXI
 * @create 2023-02-24-16:33
 */

@SpringBootTest
public class StaffServiceImplTest {

    @Autowired
    private IStaffService staffService;

    @Test
    void getStaffById(){
        System.out.println(staffService.getById(1));
    }

    @Test
    void insertStaff(){

    }
}
