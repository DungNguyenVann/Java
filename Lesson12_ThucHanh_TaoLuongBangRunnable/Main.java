package Lesson12_ThucHanh_TaoLuongBangRunnable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running...");
        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-1-HR-Database");
        runnableDemo1.start();
        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-send-Email");
        runnableDemo2.start();
        System.out.println("Main thread stopped!!");

    }
}
