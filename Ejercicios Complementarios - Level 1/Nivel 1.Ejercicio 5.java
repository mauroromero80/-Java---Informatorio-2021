import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Porfavero ingrese el primer número entero: ");

        int n1 = scan.nextInt();

        System.out.println("Porfavero ingrese el segundo número entero: ");
        
        int n2 = scan.nextInt();

        int res = 0;

        for ( int i= 0; i < n1; ++i){

            res += n2;       

        }

        System.out.println(n1 + " x " + n2 + " = " + res);

        scan.close();



    }
}