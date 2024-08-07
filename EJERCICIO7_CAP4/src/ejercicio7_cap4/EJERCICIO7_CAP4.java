package ejercicio7_cap4;
import java.util.Scanner;
/*
Hacer un algoritmo que, dados dos valores numéricos A y B, escriba un mensaje diciendo
si A es mayor, menor o igual a B
*/

public class EJERCICIO7_CAP4 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A;
        double B;
        
        System.out.print("Introduce valor de A: ");
        A = scanner.nextDouble();
        
        System.out.print("Introduce valor de B: ");
        B = scanner.nextDouble();
        
        if (A > B){
            System.out.print("A es mayor que B ");
        }else if (A == B){
            System.out.print("A es igual a B ");
        }else{
            System.out.print("A es menor que B ");} 
        
        scanner.close();
        
    }
    
}
