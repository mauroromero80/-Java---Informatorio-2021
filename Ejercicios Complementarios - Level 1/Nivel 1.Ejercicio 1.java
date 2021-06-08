import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Ingresar el nombre de usario: ");
        String name = scan.nextLine();
        System.out.println("Hola " + name);
        scan.close();
    }
}