public class ErzeugeThreads {
   
     public static void main(String[] args) {
        //beginn main Thread
        System.out.println("Erzeuge Thread gestartet");

        //Thread Objekt erzeugen
        meinThread b = new meinThread("b", 30);
        meinThread z = new meinThread("z", 100);
    

        //Thread starten 
        b.start();
        z.start();

        System.out.println("Main Thread zuende");
    }
} 
