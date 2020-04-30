package com.hc.controller;

import com.hc.bean.Dept;
import com.hc.service.DeptService;
import com.hc.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/redis")
public class DemoController {

    @Autowired
    private RedisUtil redisUtil;

    //http://localhost:8080/redis/setStr?key=ab&value=aaabbb
    @RequestMapping("/setStr")
    public String setStr(String key, String value) {
        redisUtil.set(key, value);
        return "success";
    }

    //http://localhost:8080/redis/getStr?key=ab
    @RequestMapping("/getStr")
    public Object getStr(String key) {
        return redisUtil.get(key);
    }

    //http://localhost:8080/redis/setList?key=abc&value1=aa&value2=bb&value3=cc
    @RequestMapping("/setList")
    public String setList(String key, String value1, String value2, String value3) {
        List<String> list = new ArrayList<>();
        list.add(value1);
        list.add(value2);
        list.add(value3);
        redisUtil.lSets(key, Collections.singletonList(list));
        return "success";
    }

    @Resource
    private DeptService deptService;

    @RequestMapping("/findDeptByDeptno/{deptno}")
    public Dept getEmpByEmpno(@PathVariable("deptno") int deptno) {
        return deptService.findDeptByDeptno(deptno);
    }
}
