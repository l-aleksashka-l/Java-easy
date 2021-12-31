import java.util.Objects;

public class ThreadTest2 {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Runnable task = () -> {
          synchronized (lock){
              System.out.println("thread");
          }
        };

        Thread thread = new Thread(task);
        thread.start();
        synchronized (lock){
            for (int i=0; i < 8; i++){
                Thread.sleep(1000);
                System.out.println(" " + i);
            }
            System.out.println(" ...");
        }
        // Until the Syncronized ends the thread will not start
    }
}
