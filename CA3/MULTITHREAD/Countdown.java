
class CountdownThread extends Thread {

    public void run() {
        try {
            for (int i = 5; i >= 1; i--) {
                System.out.println("Count: " + i);
                Thread.sleep(1000); // 1 second delay
            }
            System.out.println("Done!");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class Countdown {
    public static void main(String[] args) {
        CountdownThread t = new CountdownThread();
        t.start(); // start thread
    }
}
