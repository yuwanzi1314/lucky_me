package com.llh.lucky_me.system.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 1, 9);
        numbers.stream().filter(s ->
                numbers.contains(s)
        ).collect(Collectors.toList());
        numbers.stream().forEach(d -> {
            System.out.println(d + 1);
        });

        Stream<String> stream = Stream.generate(() -> "user").limit(20).skip(3);
        stream.forEach(System.out::println);

        List<String> wordList = Arrays.asList("a", "e", "c", "d", "b");
        List<String> output = wordList.stream().
                map(String::toUpperCase).sorted().
                collect(Collectors.toList());
        output.stream().filter(s -> !"A".equals(s)).forEach(s -> {
            System.out.println(s);
        });
        List<String> nullList = Arrays.asList("a", "e", "d", "b","1");
        Collections.max(nullList);
        nullList.forEach(s->System.out.println(s));
        ForkJoinPool commonPool = ForkJoinPool.commonPool();

    }
}
