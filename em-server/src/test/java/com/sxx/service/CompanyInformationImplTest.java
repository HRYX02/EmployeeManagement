package com.sxx.service;

import com.sxx.service.impl.CompanyInformationImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

/**
 * @author SHIXINXI
 * @create 2023-03-29-8:19
 */

@SpringBootTest
public class CompanyInformationImplTest {

    @Autowired
    private CompanyInformationImpl companyInformation;
    @Test
    public void test(){
        Map<String, Integer> map = companyInformation.genderRatio();
        System.out.println(map);
    }
}
