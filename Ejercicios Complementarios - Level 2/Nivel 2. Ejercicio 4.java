import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

    public static void main(String[] args) {
        

        List<String> alumnos = new ArrayList<>();

        alumnos.add("Alejandra");
        alumnos.add("Marta");
        alumnos.add("Esteban");
        alumnos.add("Soraya");
        alumnos.add("Fernando");
        alumnos.add("Horacio");
        alumnos.add("Alfredo");
        alumnos.add("Luis");
        alumnos.add("Analia");
        alumnos.add("Lorena");
        alumnos.add("Hector");
        alumnos.add("Pedro");

        List<String> grupo1 = alumnos.subList(0, 4);

        List<String> grupo2 = alumnos.subList(4, 8);

        List<String> grupo3 = alumnos.subList(8, 12);

        System.out.println("Grupo 1");

        for (String g1 : grupo1) {

            System.out.println(g1);
            
        }

        System.out.println("________________________________");
        System.out.println("________________________________");

        System.out.println("Grupo 2");

        for (String g2 : grupo2) {

            System.out.println(g2);

        }

        System.out.println("________________________________");
        System.out.println("________________________________");

        System.out.println("Grupo 3");

        for (String g3 : grupo3) {
            
            System.out.println(g3);
            
        }

        




    }
}