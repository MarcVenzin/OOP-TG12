public class meinThread implements Runnable {

    String name;
    int wait;
    Thread t;

    public meinThread(String name, int wait) {
        this.name = name;
        this.wait = wait;
        t = new Thread(this);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(name + " : " + i);

            try {
                Thread.sleep(wait);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void start(){
        t.start();
    }
}