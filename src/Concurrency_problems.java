public class Concurrency_problems extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Concurrency_problems thread = new Concurrency_problems();
        thread.start();
        //wait to thread running finish
        while(thread.isAlive()) {
            System.out.println("Waiting...");
        }
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run () {
        amount++;
    }
}
