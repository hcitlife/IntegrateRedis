package com.hc.service;

import com.hc.bean.Dept;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

/**
 * @Author: 梁云亮
 * @Date 2020/4/30 18:13
 * @Description:
 */

public interface DeptService {
    Dept findDeptByDeptno(Integer deptno);

    Dept updateDept(Dept dept);

    Dept deleteDeptByDeptno(Integer deptno);
}
