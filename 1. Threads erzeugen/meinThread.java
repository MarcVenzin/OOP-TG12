/**
 * meinThread
 */
public class meinThread extends Thread {

    // Objektvariable
    String name;
    int wait;

    // Konstruktor
    public meinThread(String name, int wait) {
        this.name = name;
        this.wait = wait;
    }

    // Run Methode
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

}