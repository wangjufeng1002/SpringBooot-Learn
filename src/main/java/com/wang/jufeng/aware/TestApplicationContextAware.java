package com.wang.jufeng.aware;

import com.wang.jufeng.Listener.TestEvent;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author wjf
 * @version 1.0
 * @date 2021/1/11 13:07
 * @desc
 */
@Component
public class TestApplicationContextAware implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext.getBeansOfType(TestApplicationContextAware.class).size());
        applicationContext.publishEvent(new TestEvent("hello msg"));
    }
}
