package com.example.springboot.xxx;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Test2Controller {
    @RequestMapping("/index02")
    public Map test02(){
        Map<String, String> map = new HashMap<>();
        map.put("name", "zs");
        map.put("age", "17");
        map.put("sex", "nan");
        return map;
    }

}
