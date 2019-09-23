package Task18;

import java.util.Arrays;
public class DataTask3 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("Первый поток");
        MyThread myThread2 = new MyThread("Второй поток");
        MyThread myThread3 = new MyThread("Третий поток");
        MyThread myThread4 = new MyThread("Четвертый поток");
        MyThread myThread5 = new MyThread("Пятый поток");
        MyThread myThread6 = new MyThread("Шестой поток");
        MyThread myThread7 = new MyThread("Седьмой поток");
        MyThread myThread8 = new MyThread("Восьмой поток");
        MyThread myThread9 = new MyThread("Девятый поток");
        MyThread myThread10 = new MyThread("Десятый поток");

        myThread.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();
        myThread6.start();
        myThread7.start();
        myThread8.start();
        myThread9.start();
        myThread10.start();
    }
}
class MyThread extends Thread {

    public MyThread(String name) {
        this.setName(name);
    }
    @Override
    public void run() {
        super.run();
        Test1.random();
    }
}
class Test1 {
    public static /*synchronized*/  void random() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 10));
            System.out.println(Thread.currentThread().getName() + ": " + Arrays.toString(array));
        }
    }
}

