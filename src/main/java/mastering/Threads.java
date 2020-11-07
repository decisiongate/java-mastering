package mastering;

public class Threads extends Thread {

    public void task() {
        Threads thread = new Threads();
        thread.start();
        System.out.println("This code is outside of the thread");
    }

    public void run() {
        System.out.println("This code is running in a thread");
    }

}
