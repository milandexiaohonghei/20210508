package thread.thread0424;

public class ThreadDemo9 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(999999);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"张三");
    }
}
