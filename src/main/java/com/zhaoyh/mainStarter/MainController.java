package com.zhaoyh.mainStarter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaoyh on 2017/8/30.
 */
@RestController
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String test() {
        return "Hello World!";
    }

}
