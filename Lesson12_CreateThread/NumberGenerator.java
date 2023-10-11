package Lesson12_CreateThread;

public class NumberGenerator implements Runnable {
    private Thread t;
    private String nameThread;
    NumberGenerator(String nameThread){
        this.nameThread=nameThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread "+nameThread + ": " + i + " ");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator("1");
        NumberGenerator numberGenerator2 = new NumberGenerator("2");
        Thread a = new Thread(numberGenerator1);
        a.start();
        Thread b = new Thread(numberGenerator2);
        b.start();

        a.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(Thread.MIN_PRIORITY);

    }
}
