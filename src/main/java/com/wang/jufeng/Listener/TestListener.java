package com.wang.jufeng.Listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author wjf
 * @version 1.0
 * @date 2021/1/11 13:10
 * @desc
 */
@Component
public class TestListener implements ApplicationListener<TestEvent> {


    @Override
    public void onApplicationEvent(TestEvent event) {
        System.out.println(event.getSource().toString());
    }
}
