package thread.thread0424;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo8 {
    static class MyCallable implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            int num = new Random().nextInt(10);
            System.out.println(String.format("线程：%s,产生了随机数:%d",Thread.currentThread().getName(),num));
            return num;
        }
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable callable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(callable);


        Thread thread = new Thread(futureTask);
        thread.start();
        int num = futureTask.get();
        System.out.println(num);


    }
}
