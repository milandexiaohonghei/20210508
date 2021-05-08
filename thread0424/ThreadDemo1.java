package thread.thread0424;

public class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
        String content = "hsdhkfshkshfkshfkasfkla";
        for(char item:content.toCharArray()){
            System.out.print(item);
            Thread.sleep(300);
        }
    }


}
