//package Task18;
//
//public class DataTask1 {
//    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());   // вывести имя потока
//        //MyThread thread1 = new MyThread();
//        new MyThread().start();
//
//        MyRunnable myRunnable = new MyRunnable();
//        Thread thread2 = new Thread(myRunnable);
//        thread2.start();
//    }
//}
//class MyThread extends Thread {
//    @Override
//    public void run() {
//        System.out.println(Thread.currentThread().getName() + " - This is thread 1");
//    }
//}
//class MyRunnable implements Runnable {
//    @Override
//    public void run() {
//        System.out.println(Thread.currentThread().getName() + " - This is thread 2");
//    }
//}

//Два способа создания потоков:
//1- class MyThread extends Thread, @Override run + вызов start()
//2- class MyRunnable implements Runnable, @Override run + вызов start()

//Отличия запуска:
//MyThread extends Thread - запускаем через сразу через создание объекта
//MyRunnable implements Runnable - запускам через конструктор

//Вызов потока только 1 раз: после состояние = DEAD
//Вызов потоков по умолчанию происходит рандомно