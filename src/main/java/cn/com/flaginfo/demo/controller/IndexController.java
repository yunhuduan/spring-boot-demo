package cn.com.flaginfo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by duanyunhu on 2018/2/7.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/index")
    public String index(HttpServletRequest request, ModelMap modelMap){
        modelMap.put("test",request.getParameter("p"));
        return "index";
    }

    @RequestMapping("/index1")
    public ModelAndView index1(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("test","sssss");
       return mv;
    }


    @RequestMapping("/status")
    @ResponseBody
    public Map<String,String> index(HttpServletRequest request){
        String p = request.getParameter("p");
        Map<String,String> map = new HashMap<String,String>();
        map.put("status","ok");
        map.put("p",p) ;
        return map;
    }

}
