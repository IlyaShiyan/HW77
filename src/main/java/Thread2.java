public class Thread2 implements Runnable{

    Resource resource;
    Thread2(Resource resource) {
        this.resource = resource;
    }
    @Override
    public void run() {
        resource.reduce();
    }
}
