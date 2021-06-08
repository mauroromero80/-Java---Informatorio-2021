import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Porfavor ingrese el primer número entero: ");

        int n1 = scan.nextInt();

        System.out.println("Porfavor ingrese el segundo número entero: ");
        
        int n2 = scan.nextInt();

        int res = 1;

        for ( int i= 0; i < n1; ++i){
      
            res *=n2;

        }

        System.out.println(n1 + " x " + n2 + " = " + res);

        scan.close();



    }
}