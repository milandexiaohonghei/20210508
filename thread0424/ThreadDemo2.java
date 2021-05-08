package thread.thread0424;
/**
 * 对比单线程和多线程
 */
public class ThreadDemo2 {

    private static final Long count = 10_0000_0000L;

    public static void main(String[] args) throws InterruptedException {
        //调用多线程的方法
        concurrentcy();
        //调用单线程的方法
        serirly();

    }
    //单线程方法
    private static void serirly() {
        //开始时间
        Long time = System.currentTimeMillis();
        int a = 0;
        for (int i = 0; i < count ; i++) {
            a++;

        }
        int b = 0;
        for (int i = 0; i < count ; i++) {
            b++;
        }
        int c = 0;
        for (int i = 0; i < count ; i++) {
            c++;
        }
        Long entime = System.currentTimeMillis();
        System.out.println("单线程执行时间" + (entime - time ));

    }

    //多线程的方法
    private static void concurrentcy() throws InterruptedException {
        Long time = System.currentTimeMillis();
        int a = 0;
        for (int i = 0; i < count ; i++) {
            a++;
        }
        //李四同时执行业务
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int b = 0;
                for (int i = 0; i < count ; i++) {
                    b++;
                }
            }
        });
        //执行线程
        t1.start();
        //王五
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int c = 0;
                for (int i = 0; i < count ; i++) {
                    c++;
                }
            }
        });
        //执行线程
        t2.start();
        t1.join();
        t2.join();
        Long entime = System.currentTimeMillis();
        System.out.println("多线程执行时间" + (entime - time ));
    }
}
