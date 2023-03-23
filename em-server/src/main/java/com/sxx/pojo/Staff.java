package com.sxx.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.sxx.enums.SexEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author SHIXINXI
 * @create 2023-02-22-8:51
 */

@Data
@NoArgsConstructor
public class Staff {

    /**
     * 指明主键id以防出现where null = #{id}
     */
    @TableId
    private Integer id;
    private Integer empId;
    private String name;
    private SexEnum sex;
    private Double salary;
    private Integer jobId;
    private String phoneNum;
    private Integer departmentId;
    private String post;
    @TableLogic
    private Integer isDelete;


    public Staff(Integer empId, String name, SexEnum sex, String phoneNum) {
        this.empId = empId;
        this.name = name;
        this.sex = sex;
        this.phoneNum = phoneNum;
    }

    public Staff(Integer empId, String name, SexEnum sex, Double salary, Integer jobId, String phoneNum, Integer departmentId, String post) {
        this.empId = empId;
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.jobId = jobId;
        this.phoneNum = phoneNum;
        this.departmentId = departmentId;
        this.post = post;
    }

    @Override
    public String toString() {
        return "员工ID：" + empId + " 姓名：" + name + " 性别：" + sex  + " 工资：" + salary + " 工作ID：" + jobId + " 电话：" + phoneNum + " 部门ID：" + departmentId + " 职务：" + post;
    }
}
