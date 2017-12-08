package com.zhaoyh.utils;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by zhaoyh on 2017/9/4.
 */
@Component
public class TestTask {

    /**
     * 每隔5秒运行
     */
    @Scheduled(fixedRate = 5000)
    public void runTask() {
        System.out.println("5.......");
    }
}
