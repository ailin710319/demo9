package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaintenanceMonitorcTest {
    MaintenanceMonitorc mon = new MaintenanceMonitorc();

    @Test
    void setTest1(){
        String res = mon.set("");
        String expRes= "Everything operates as expected";
        assertEquals(expRes, res);
    }
    @Test
    void setTest2(){
        String res = mon.set("Service checks: No power until 5:00 pm");
        String expRes = "Service checks: No power until 5:00 pm";

        assertEquals(expRes, res);
    }

    @Test
    void resetTest1(){
        String res = mon.reset("yes");
        String expRes = "ok";
        assertEquals(expRes, res);
    }

    @Test
    void deliverTest1(){
        String res = mon.deliver();
        String expRes = "Everything operates as expected";
        assertEquals(expRes,res);
    }
}
