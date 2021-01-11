package com.wang.jufeng.Listener;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

/**
 * @author wjf
 * @version 1.0
 * @date 2021/1/11 13:11
 * @desc
 */
public class TestEvent extends ApplicationEvent implements Serializable {
    String msg;

    public TestEvent(Object source) {
        super(source);
    }

    public TestEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    @Override
    public Object getSource() {
        return super.getSource();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
