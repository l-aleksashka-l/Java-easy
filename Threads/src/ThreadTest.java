public class ThreadTest {
    public static void main(String[] args) {
        //1
        args = new String[1];
        args[0] = "Lukash";
        System.out.println("Hello, " + args[0] + "!\n");
        //2
        Thread currentThread = Thread.currentThread();
        ThreadGroup threadGroup = currentThread.getThreadGroup();
        System.out.println("Thread: " + currentThread.getName());
        System.out.println("Thread Group: " + threadGroup.getName());
        System.out.println("Parent Group: " + threadGroup.getParent().getName() + "\n");
        //3
        Thread threadError = Thread.currentThread();
        threadError.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler()
        {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Error: " + e.getMessage());

            }
        });
        System.out.println(2/0);

    }
}
