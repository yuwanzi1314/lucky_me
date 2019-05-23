package com.llh.lucky_me.modle.component.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(1024);
        QueueProducer queueProducer = new QueueProducer(queue);
        QueueConsumer queueConsumer = new QueueConsumer(queue);
        new Thread(queueProducer).start();
        new Thread(queueConsumer).start();

        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");
        map.put("5", "e");
        map.put("6", "f");
        map.put("7", "g");
        map.put("8", "h");
        new Thread1(map).start();
        new Thread2(map).start();



    }
}
