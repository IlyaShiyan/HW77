public class Main {
    public static void main(String[] args) {
        Resource resource=new Resource();
        Thread1 thread1 = new Thread1(resource);
        Thread2 thread2 = new Thread2(resource);
        new Thread(thread1).start();
        new Thread(thread2).start();

    }
}
