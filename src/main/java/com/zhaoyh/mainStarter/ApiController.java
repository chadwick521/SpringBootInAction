//package com.zhaoyh.mainStarter;
//
//import org.json.simple.JSONObject;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * Created by zhaoyh on 2017/9/6.
// */
//@RestController
//@RequestMapping("/api")
//public class ApiController {
//
//    @RequestMapping(value = "/test", method = RequestMethod.GET)
//    public String test(HttpServletRequest request, HttpServletResponse response) {
//        JSONObject json = new JSONObject();
//        String name = request.getParameter("name");
//        json.put("name", name);
//        return renderJsonString(response, json.toString());
//    }
//
//
//    /**
//     * 处理返回
//     * @param response
//     * @param jsonString
//     * @return
//     */
//    protected static String renderJsonString(HttpServletResponse response, String jsonString) {
//        response.setContentType("application/json;charset=utf-8");
//        try {
//            response.getWriter().write(jsonString);
//            response.flushBuffer();
//            return null;
//        } catch (IOException e) {
//            String message = "Response Json Failed!";
//            throw new RuntimeException(message, e);
//        }
//    }
//
//}
