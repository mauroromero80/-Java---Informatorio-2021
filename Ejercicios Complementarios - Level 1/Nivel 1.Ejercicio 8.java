import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nombre y Apellido: ");
        String nomApell = scan.nextLine();

        System.out.println("Edad: ");
        String edad = scan.nextLine();

        System.out.println("Dirección: ");
        String direccion = scan.nextLine();
        scan.close();

        System.out.println("Ciudad: ");
        String ciudad = scan.nextLine();

       
        System.out.print(ciudad + " - " + direccion + " - "+ edad + " - " + nomApell);

        

    }
}