public class Thread1 implements Runnable {

    Resource resource;
    Thread1(Resource resource){
        this.resource = resource;
    }
    @Override
    public void run() {
        resource.increase();
    }
}
