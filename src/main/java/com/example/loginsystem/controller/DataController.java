package com.example.loginsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataController {

    @GetMapping("/data/list1")
    @ResponseBody
    public String getDataList1() {
        return "用户权限可访问数据列表";
    }


    @GetMapping("/data/list2")
    @ResponseBody
    public String getDataList2() {
        return "经理权限可访问数据列表";
    }

    @GetMapping("/data/list3")
    @ResponseBody
    public String getDataList3() {
        return "管理员权限可访问数据列表";
    }

}
