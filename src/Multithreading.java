
public class Multithreading implements Runnable {
    public static void main(String[] args) {
        Multithreading obj = new Multithreading();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("Outside of thread");
    }

    @Override
    public void run() {
        System.out.println("This code running in a thread");
    }
}

//extending thread class
//public class Multithreading extends Thread {
//    public static void main(String[] args) {
//        Multithreading thread = new Multithreading();
//        thread.start();
//        System.out.println("Outside of thread");
//    }
//
//    @Override
//    public void run() {
//        System.out.println("This code running in a thread");
//    }
//}
