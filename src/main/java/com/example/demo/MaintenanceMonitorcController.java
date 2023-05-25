package com.example.demo;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MaintenanceMonitorcController {

    MaintenanceMonitorc mon = new MaintenanceMonitorc();

    @RequestMapping("/set")
    public String set(@RequestParam String message) {
        mon.set(message);
        return "ok";
    }

    @RequestMapping("/reset")
    public String reset(@RequestParam String reset) {
        mon.reset(reset);
        return "ok";
    }
    @RequestMapping("/deliver")
    public String deliver(){
        return mon.deliver();
    }


}