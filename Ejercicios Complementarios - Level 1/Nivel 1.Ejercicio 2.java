import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Ingresar el primer numero entero: ");
        int n1 = scan.nextInt();
        System.out.println("Ingresar el segundo numero entero: ");
        int n2 = scan.nextInt();
        scan.close();

        System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
        System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
        System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
        System.out.println(n1 + " % " + n2 + " = " + (n1%n2));
        
    }
}