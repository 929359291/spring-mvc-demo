package cn.jiguang.controller;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    
    @RequestMapping(value="list", method=RequestMethod.POST)
    @ResponseBody
    public List<String> getJson(@RequestBody List<String> list){
        if (!CollectionUtils.isEmpty(list)) {
            for (String string : list) {
                System.out.println(string);
            }
        }
        return list;
    }
}
