package com.hts.utils;

/**
 * Created by zhaoyh on 2017/9/4.
 */
public class TestBean {

    private String name;

    public TestBean(String name) {
        this.name = name;
    }

    public void test() {
        System.out.println("Bean: " + name);
    }

}
