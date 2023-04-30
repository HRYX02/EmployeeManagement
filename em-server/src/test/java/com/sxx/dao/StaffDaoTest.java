package com.sxx.dao;

import com.sxx.enums.SexEnum;
import com.sxx.entity.StaffPO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author SHIXINXI
 * @create 2023-02-24-16:03
 */

@SpringBootTest
public class StaffDaoTest {

    @Autowired
    private StaffDao staffDao;

    @Test
    void selectById(){
        System.out.println(staffDao.selectById(1));
    }

    @Test
    void insertStaff(){
        StaffPO staff = new StaffPO(2,"史鑫玺", SexEnum.MAIL,"123");
        System.out.println(staffDao.insert(staff));
    }
}
