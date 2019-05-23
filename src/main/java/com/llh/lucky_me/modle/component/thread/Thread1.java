package com.llh.lucky_me.modle.component.thread;

import java.util.Map;

public class Thread1 extends Thread{
    private final Map map;

    Thread1(Map map) {
        this.map = map;
    }

    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        map.remove("6");
    }

}
