import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        List<String> cartas = new ArrayList<>();


        cartas.add("1");
        cartas.add("2");
        cartas.add("3");
        cartas.add("4");
        cartas.add("5");
        cartas.add("6");
        cartas.add("7");
        cartas.add("8");
        cartas.add("9");
        cartas.add("10");
        cartas.add("11");
        cartas.add("12");
        cartas.add("13");

        // imprimiendo las cartas en orden en que fueron añadidos
        for (String carta : cartas) {

            System.out.println("Carta - " + carta);
            
        }

        
        System.out.println("---------------------");
        System.out.println("---------------------");

        // imprimiendo las cartas en orden inverso
        for (int i = cartas.size() -1; i >= 0; --i){

            System.out.println("Carta - " + cartas.get(i));

        }


        System.out.println("---------------------");
        System.out.println("---------------------");


        // imprimiendo las cartas mezcladas
        Collections.sort(cartas);

        for (String carta : cartas) {
            
            System.out.println("Carta - " + carta);

        }


        
    }

}