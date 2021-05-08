package thread.thread0424;

public class ThreadDemo3 {
    static class MyThread extends Thread{
        @Override
        public void run() {
            //写业务代码
            System.out.println("子线程名称" + Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        //1.继承Thread类
        MyThread myThread = new MyThread();
        //启动线程
        myThread.start();
        System.out.println("主线程名称" + Thread.currentThread().getName());

    }
}
