package com.example.loginsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MenuController {

    @GetMapping("/menu/list1")
    @ResponseBody
    public String getDataList1() {
        return "用户权限菜单列表";
    }

    @GetMapping("/menu/list2")
    @ResponseBody
    public String getDataList2() {
        return "经理权限菜单列表";
    }

    @GetMapping("/menu/list3")
    @ResponseBody
    public String getDataList3() {
        return "管理员权限菜单列表";
    }

}
