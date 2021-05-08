package thread.thread0424;

public class ThreadDemo7 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("线程名:" + Thread.currentThread().getName());
        });
        thread.start();
    }
}
