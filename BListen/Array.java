public class Array(

    public static void main(String[] args) {
        //Erstelle ein Array
        String [] Array = new String[3];

        //Speichern von Werten in Array
        Array[0]="Marc";
        Array[1]="Niklas";
        Array[2]="Sebastian";
        Array[3]="Florian";

        //Löschen eines Wertes
        Array[0]="Simon";
        
        //Ausgabe eines Arrays
        for (String strname :Array){
            System.out.println(strname);
        }

        //Prüfe ob wert in Liste
        for(String strname : Array){
            if (strname.equals("Simon")) {
                System.out.println(strname);
            }
        }
    }
)