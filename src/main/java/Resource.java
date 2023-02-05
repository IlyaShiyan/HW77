public class Resource {
    private int i =0;
    public synchronized void increase() {
        if (i >=10) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }else {
            i += 10;
            System.out.println(i);
            notify();
        }
    }
    public synchronized void reduce() {
        if (i != 10) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }else {
            i -= 5;
            System.out.println(i);
            notify();
        }
    }
}

