import java.util.LinkedList;
import java.util.Scanner;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> einkaufsliste = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        //Werte hinzufügen+
        einkaufsliste.add("Milch");
        einkaufsliste.add("Brot");
        einkaufsliste.add("Hackfleisch");

        System.out.println(einkaufsliste + "\n"+" Wollen Sie was hinzufügen ? ");

        while (einkaufsliste.add(sc.next())) {
            System.out.println(einkaufsliste + "\n"+" Wollen Sie was hinzufügen ? ");
          
        }
        

       

        //Ausgabe
        System.err.println(einkaufsliste);
    

    }
}
