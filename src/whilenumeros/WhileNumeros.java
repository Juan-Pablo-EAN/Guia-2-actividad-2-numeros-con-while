package whilenumeros;

import java.util.Scanner;

public class WhileNumeros {
    
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int n = 0;
        
        System.out.println("Escribe un numero positivo o negativo");
        System.out.println("El programa se detendra cuando escribas cero");
        n = entrada.nextInt();
        
        while (n != 0){
            if (n < 0){
                double cdr = Math.pow(n, 2);
                System.out.println("El cuadrado de " + n + " es " + cdr);
            } else {
                double cubo = Math.pow(n, 3);
                System.out.println("El cubo de " + n + " es " + cubo);
            }
            System.out.println("Escibre otro numero");
            n = entrada.nextInt();
        }
    }
}
