package Lesson12_ChanLe;

public class EvenThread extends Thread {
    private Thread t;

    @Override
    public void run() {
        try {
            for (int i = 1; i < 11; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    Thread.sleep(15);
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
