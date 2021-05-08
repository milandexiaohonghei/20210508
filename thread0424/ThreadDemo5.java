package thread.thread0424;

public class ThreadDemo5 {
    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("线程名" + Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

    }
}
