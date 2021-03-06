package com.lijoy.configClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {

    @Autowired
    private GitAutoRefreshConfig gitAutoRefreshConfig;

    @GetMapping(value = "autoShow",produces = "application/json;charset=utf-8")
    public Object autoShow(){
        return gitAutoRefreshConfig;
    }
}