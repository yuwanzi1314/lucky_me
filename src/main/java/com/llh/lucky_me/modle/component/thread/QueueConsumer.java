package com.llh.lucky_me.modle.component.thread;

import java.util.concurrent.BlockingQueue;

public class QueueConsumer implements Runnable {
    private BlockingQueue queue = null;

    QueueConsumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
