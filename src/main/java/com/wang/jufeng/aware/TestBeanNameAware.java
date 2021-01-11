package com.wang.jufeng.aware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * @author wjf
 * @version 1.0
 * @date 2021/1/11 13:03
 * @desc
 */
@Component
public class TestBeanNameAware implements BeanNameAware {
    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }
}
