import java.util.concurrent.TimeUnit;

public class ThreadTest1 {
    public static class TestThread extends Thread{
        @Override
        public void run(){
            System.out.println("Thread ON\n");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Runnable task = () -> {
            System.out.println("Thread 2 ON\n");
        };

        Runnable task1 = () -> {
            int secToWait = 1000 * 6;
            try {
                Thread.sleep(secToWait);
                System.out.println("Thread 3 first ON");

                TimeUnit.SECONDS.sleep(6);
                System.out.println("Thread 3 second ON\n");
            } catch (InterruptedException e) {
                System.out.println("Interrupted\n");
            }
        };

        Runnable task2 = () -> {
            try {
                TimeUnit.SECONDS.sleep(13);
                System.out.println("Thread 4 ON\n");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        };

        Thread thread = new TestThread();
        thread.start();
        Thread thread1 = new Thread(task);
        thread1.start();
        Thread thread2 = new Thread(task1);
        thread2.start();
        Thread thread3 = new Thread(task1);
        thread3.start();
        thread3.interrupt();
        Thread thread4 = new Thread(task2);
        thread4.start();
        thread4.join();  //Ожидание завершения этого потока
        System.out.println("Finished!");



    }
}
