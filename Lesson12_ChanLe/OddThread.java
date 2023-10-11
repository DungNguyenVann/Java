package Lesson12_ChanLe;

public class OddThread extends Thread {
    private Thread thread;

    @Override
    public void run() {
        try {
            for (int i = 1; i < 11; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                    Thread.sleep(10);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
