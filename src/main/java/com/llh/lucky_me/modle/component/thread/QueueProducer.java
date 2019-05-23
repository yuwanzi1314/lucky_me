package com.llh.lucky_me.modle.component.thread;

import java.util.concurrent.BlockingQueue;

public class QueueProducer implements Runnable{
    private BlockingQueue<String> queue = null;

    QueueProducer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            queue.put("1");
            Thread.sleep(1000);
            queue.put("2");
            Thread.sleep(1000);
            queue.put("3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
