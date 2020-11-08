package mastering;

public class ThreadsImpl implements Runnable {

    public void task() {
        ThreadsImpl obj = new ThreadsImpl();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }

    public void run() {
        System.out.println("This code is running in a thread");
    }
}
