package A4Threadsstoppen;

 
import java.util.Scanner;

 

/**

 * ErzeugeThreads

 */

public class ErzeugeThreads {

 

    public static void main(String[] args) {

        System.out.println("MyThread gestartet");

 

        // Threadobjekte erzeugen

        Counter a = new Counter(200);

 

        // Threads nebenläufig starten

        a.start();

       

        System.out.println("MyThread zuende");

 

       

 

    }

}