//package Task18;
//
//public class DataTask2 {
//    public static void main(String[] args) throws InterruptedException{
//        MyThread myThread = new MyThread();
//        new MyThread().start();
//        //myThread.sleep(2000);                           //пример Sleep для потока Main + обязательно InterruptedException
//        //myThread.setPriority(Thread.MAX_PRIORITY);      //приоритет: MIN(1)-NORM(5)-MAX(10)
//        //Thread.yield();                                 //Static метод только для текущего потока, выполнение др.потока (не всегда!)
//
//        myThread.join();                                  //Выполнение всегда другого потока
//        System.out.println(Thread.currentThread().getName() + " - This is thread 0");
//    }
//}
// class MyThread extends Thread {
//        @Override
//        public void run() {
//            System.out.println(Thread.currentThread().getName() + " - This is thread 1");
//        }
//    }


//Жизненный цикл потоков:
//New - как только вызываем start()

//Runnable - переходит в пул потоков, но не запускается <-
                                                         //Waiting/Blocking/Sleeping
//Running - выполнение (может обратно в Runnable)       ->
//По умолчанию постоянно рандомно меняются, пример: 1 поток в Runnable, 1 в Running

//Dead
