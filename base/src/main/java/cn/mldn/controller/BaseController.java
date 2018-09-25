package cn.mldn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by super on 2018/9/19.
 */
@RestController
public class BaseController {

    @RequestMapping(value = "/hello")
    public String base(){
        return "peace World";
    }
}
