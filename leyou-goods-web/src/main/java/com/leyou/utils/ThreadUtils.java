package com.leyou.utils;

import java.util.concurrent.*;

/**
 * 线程工具类
 */
public class ThreadUtils {

    private static final ExecutorService es = Executors.newFixedThreadPool(10);

    public static void execute(Runnable runnable){
        es.submit(runnable);
    }
}
