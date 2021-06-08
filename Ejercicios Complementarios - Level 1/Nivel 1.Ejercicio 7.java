import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese una palabara en minuscula: ");

        String pal = scan.nextLine();

        scan.close();

        String abC = "QWERTYUIOPASDFGHJKLÑZXCVBNM";

        String abc = "qwertyuiopasdfghjklñzxcvbnm";

        for (int i = 0; i < pal.length(); ++i){

            for (int a = 0; a < abc.length(); ++a){

                if (pal.charAt(i) == abc.charAt(a)) {

                        System.out.print(abC.charAt(a));
                    
                }

            }


        }