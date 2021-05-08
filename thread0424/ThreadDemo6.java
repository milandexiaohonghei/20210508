package thread.thread0424;

public class ThreadDemo6 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("当前线程" + Thread.currentThread().getName());
            }
        });
        thread.start();
    }
}
