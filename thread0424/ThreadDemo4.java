package thread.thread0424;

public class ThreadDemo4 {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("当前线程名称：" + Thread.currentThread().getName());
            }
        };
        thread.start();
    }
}
