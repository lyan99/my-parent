package com.chen.my.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主界面
 * @author chenlei
 *
 */
@Controller
public class MainController extends BaseController {

    @RequestMapping(value = "/login")
    public String login() {
        return "/login";
    }
    
    @RequestMapping(value = "/main")
    public String main() {
        return "/main";
    }

    @RequestMapping(value = "/main2")
    public String main2() {
        return "/main2";
    }

    @RequestMapping(value = "/main3")
    public String main3() {
        return "/main3";
    }
    
    
    @RequestMapping(value = "/socktpage")
    public String socketpage() {
        return "/socktpage";
    }
    
    /******************************************************************************/
    
    @RequestMapping(value = "/flight/ticketList")
    public String ticketList() {
        return "/flight/ticketList";
    }
    


}
