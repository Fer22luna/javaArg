package primerProyecto;
import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {

    	
   	
    	Calculadora operacion = new Calculadora();
    	
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escribir un numero");
        double unNumero = input.nextDouble();
        System.out.println("Escribir otro numero");
        double otroNumero = input.nextDouble();
        
        System.out.println("Ingrese la operacion: sumar, restar, dividir o multiplicar ");
        input.nextLine();
        String operador = input.nextLine();
        		
        switch(operador) {
        
        case "sumar":
        	System.out.println(operacion.sumar(unNumero,otroNumero));
        	break;
        case "restar":
        	System.out.println(operacion.restar(unNumero,otroNumero));
        	break;
        case "multiplicar":
        	System.out.println(operacion.multiplicar(unNumero,otroNumero));
        	break;
        case "dividir":
        	System.out.println(operacion.dividir(unNumero,otroNumero));
        	break;
        default:
        	System.out.println("La operacion no ha sido ingresada correctamente");
        	break;
        
        }
         	
    }
    
    
}    

