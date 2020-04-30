package com.hc.service.impl;

import com.hc.bean.Dept;
import com.hc.service.DeptService;
import com.hc.utils.RedisUtil;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: 梁云亮
 * @Date 2020/4/30 18:15
 * @Description:
 */

@Service
@CacheConfig(cacheManager = "cacheManager", cacheNames = "dept")
public class DeptServiceImpl implements DeptService {

    @Override
    @Cacheable(keyGenerator = "myKeyGen")
    public Dept findDeptByDeptno(Integer deptno) {
        System.out.println("DeptService findDeptByDeptno ...");
        return new Dept(10, "aa", "aaaaaaa");
    }

    @CachePut(keyGenerator = "updateByIdKeyGen")
    @Override
    public Dept updateDept(Dept dept) {
        System.out.println("DeptService updateDept ...");
        return new Dept(10, "123", "rewrweq");
    }

    @CacheEvict(keyGenerator = "deleteByIdKeyGen")
    @Override
    public Dept deleteDeptByDeptno(Integer deptno) {
        System.out.println("DeptService deleteDeptByDeptno ...");
        return new Dept(10, "aa", "aaaaaaa");
    }
}
