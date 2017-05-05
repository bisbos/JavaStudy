package com.mystudy.threads;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by bbose on 4/26/17.
 */
public class CallableStudy implements Callable {

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return Thread.currentThread().getName();
    }

    public static void main(String[] args){
        //Get ExecutorService from Executors utility class, thread pool size is 10
        ExecutorService executor = Executors.newFixedThreadPool(10);

        //create a list to hold the Future object associated with Callable
        List<Future<String>> futureList = new ArrayList<>();

        Callable<String> callable = new CallableStudy();

        for (int i=0;i<50;i++){
            //submit Callable tasks to be executed by thread pool
            Future<String> future = executor.submit(callable);
            futureList.add(future);
        }

        for (Future<String> future :futureList){
            try {
                System.out.println(new Date()+" "+future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();




    }
}
