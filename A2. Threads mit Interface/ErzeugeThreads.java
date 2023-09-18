public class ErzeugeThreads {
   
     public static void main(String[] args) {
        //beginn main Thread
        System.out.println("Erzeuge Thread gestartet");

        //Thread Objekt erzeugen
        meinThread a = new meinThread("a", 30);
        meinThread x = new meinThread("x", 100);
    

        //Thread starten 
        a.start();
        x.start();

        System.out.println("Main Thread zuende");
    }
} 
