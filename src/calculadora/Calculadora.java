
package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String operacion;
        int resultado;
        System.out.println("Elige que operacion deseas realizar");
        System.out.println("SUMA - RESTA - MULTIPLICACION");
        operacion = teclado.nextLine();
        
        String texto = operacion.toLowerCase();
        
        System.out.println("Ingrese el primer numero: ");
            int a = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
            int b = teclado.nextInt();
            
            if("suma".equals(texto)){
                System.out.println("---------SUMA------------");
            }
            else if("resta".equals(texto)){
                System.out.println("---------RESTA-----------");    
            }
            else if("multiplicacion".equals(texto)){
                System.out.println("---------MULTIPLICACION-----------");
            }
            else{
                System.out.println("Lo siento pero nuestra calculadora no cuenta con esa operacion");}
    }
    
}
