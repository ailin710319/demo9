package com.example.demo;

public class MaintenanceMonitorc {
    private String message= "Everything operates as expected";



    public String set(String set) {
        if(set != null && !set.trim().equals("")){
            message = set;
        }
        return message;
    }

    public String reset(String reset) {
        if (reset.equals("yes")){
            message = "Everything operates as expected";
        }
        return "ok";
    }

    public String deliver(){
        return this.message;
    }

}
