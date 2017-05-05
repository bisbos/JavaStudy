package com.mystudy.threads;

import java.util.concurrent.*;

/**
 * Created by bbose on 4/26/17.
 */
public class FutureTaskStudy {

    public static void main(String[] args){
        CallableForFuture callable1 = new CallableForFuture(1000);
        CallableForFuture callable2 = new CallableForFuture(2000);

        FutureTask<String> futureTask1 = new FutureTask<String>(callable1);
        FutureTask<String> futureTask2 = new FutureTask<String>(callable2);

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(futureTask1);
        executor.submit(futureTask2);

        while (true){
            try {
            if (futureTask1.isDone()&& futureTask2.isDone()){
                System.out.println("Done");
                executor.shutdown();
            }if (!futureTask1.isDone()){

                    System.out.println(futureTask1.get());
                    System.out.println("Waiting for future task 2");
                    System.out.println(futureTask2.get(200L,TimeUnit.MILLISECONDS));
                }
            }catch (ExecutionException  | InterruptedException | TimeoutException e) {
                e.printStackTrace();
        }
        }


    }


}

class CallableForFuture implements Callable{

    private long waittime;

    public CallableForFuture(int waittime){
        this.waittime = waittime;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return Thread.currentThread().getName();
    }
}
