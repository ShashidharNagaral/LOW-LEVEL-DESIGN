package scratchbook;

public class MyClass implements Runnable{
    @Override
    public void run() {
        try {
            for(int i=0; i<4; i++) {
                System.out.println(Thread.currentThread().getId()+" : "+i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
