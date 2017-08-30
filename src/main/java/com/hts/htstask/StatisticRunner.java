package com.hts.htstask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.util.logging.Logger;

/**
 * Created by zhaoyh on 2017/8/30.
 */
@Component
public class StatisticRunner {

    private static Logger LOG = Logger.getLogger(StatisticRunner.class.getName());

    private static final String test_host = "tb014x.corp.youdao.com";
    private static final String test_user = "fanyi";
    private static final String test_password = "fanyi123outfox";
    private static final String test_db = "atranslate";
    private static final String test_dbPostfix = "_x";

    private static final String online_host = "nc005x.corp.youdao.com";
    private static final String online_user = "fanyiread";
    private static final String online_password = "new1ife4Th1sAugust";
    private static final String online_db = "atranslate";
    private static final String online_dbPostfix = "_online";

    private static final String online_write_host = "dictdb-writer";
    private static final String online_write_user = "fanyi";
    private static final String online_write_password = "new1ife4Th1sAugust";
    private static final String online_write_db = "atranslate";
    private static final String online_write_dbPostfix = "_online";

    public void init() {
    }

    /**
     * 每隔5秒运行
     */
    @Scheduled(fixedRate = 15000)
    public void runTask() {
        LOG.warning("Execute in every 5 seconds!");
    }

    /**
     * 每天17:35运行
     */
    @Scheduled(cron = "00 41 17 * * ?")
    public void runTask2() {
        LOG.warning("Execute in every 17:35!");
    }

}
