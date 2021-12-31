public class ThreadTest3 {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Runnable task = () -> {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
            }
            System.out.println("thread");
        };
        Thread thread = new Thread(task);
        thread.start();
        Thread.sleep(1000);
        System.out.println("main");
        synchronized (lock){
            lock.notify();
        }
    }
}
