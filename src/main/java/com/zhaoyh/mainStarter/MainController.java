package com.zhaoyh.mainStarter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by zhaoyh on 2017/8/30.
 */
@Controller
public class MainController {

    @RequestMapping("/index")
    public String test(Map<String,Object> map) {
        return "index";
    }

}
