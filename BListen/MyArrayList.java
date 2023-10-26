import java.util.ArrayList;

public class MyArrayList {
    
    public static void main(String[] args) {
        
        //ArrayList erzeugen
        ArrayList<Integer> namen = new ArrayList<>();

        //Objekte hinzufügen
        namen.add(1);
        namen.add(2);
        namen.add(3);
        
        //Liste ausgeben
        System.out.println(namen);

        //Objekt entfernen
        namen.remove(2);

        //Liste iterieren
        For(Integer i :namen){
            System.out.println(i);
        }
        for (int i =0; namen.size();i++) {
            System.out.println(namen.contains(1));
        }

        // Überprüfe ob Wert in der Liste 
        System.out.println(namen.contains(1));

        //Wert aus der Liste holen
        integer i1 =namen.get(2);


    }
}
