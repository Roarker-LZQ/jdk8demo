package com.lzq.jdk8.fun.consumer;

import java.util.function.Consumer;

public class ConsumerTest01 {
    public static void main(String[] args) {
        test01(str->{
            System.out.println(str+"转换大写后："+str.toUpperCase());

        });
    }

    public static void test01(Consumer<String> consumer) {
        String str = "Hello World";
        consumer.accept(str);

    }
}
