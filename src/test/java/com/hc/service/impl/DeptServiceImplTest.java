package com.hc.service.impl;

import com.hc.bean.Dept;
import com.hc.service.DeptService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: 梁云亮
 * @Date 2020/4/30 18:34
 * @Description:
 */

@RunWith(SpringRunner.class)
@SpringBootTest
class DeptServiceImplTest {

    @Resource
    private DeptService deptService;

    @Test
    void findDeptByDeptno() {
        Dept dept = deptService.findDeptByDeptno(10);
        System.out.println(dept);
    }

    @Test
    void updateDept(){
        Dept dept0 = new Dept(10,"abc","cba");
        Dept dept = deptService.updateDept(dept0);
        System.out.println(dept);
    }

    @Test
    void deleteDeptByDeptno(){
        Dept dept = deptService.deleteDeptByDeptno(10);
        System.out.println(dept);
    }
}