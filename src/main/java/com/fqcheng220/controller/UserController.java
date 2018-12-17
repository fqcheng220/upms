package com.fqcheng220.controller;

import com.fqcheng220.model.UpmsUser;
import com.fqcheng220.service.IUpmsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private IUpmsUserService upmsUserService;

    @RequestMapping(value = "/user/add",method = RequestMethod.POST)
    @ResponseBody
    public int addUser(@RequestBody UpmsUser upmsUser){
        return upmsUserService.insert(upmsUser);
    }

    @RequestMapping(value = "/user/list/all",method = RequestMethod.GET)
    @ResponseBody
    public List<UpmsUser> listAllUser(){
        return upmsUserService.listAllUser();
    }
}
