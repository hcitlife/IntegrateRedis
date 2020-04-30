package com.hc.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: 梁云亮
 * @Date 2020/4/30 14:39
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dept implements Serializable {
    private static final long serialVersionUID = -1092294594385392402L;
    private Integer deptno;
    private String dname;
    private String loc;
}
