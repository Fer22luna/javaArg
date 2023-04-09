package primerProyecto;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

    	
  // Ejercicio a y b )
    	/*
        Scanner input = new Scanner(System.in);
        
        System.out.println(" Ingrese nombre");
        String nombre = input.nextLine();
        System.out.println(" Ingrese apellido");
        String apellido = input.nextLine();
        System.out.println("ingrese edad");
        int edad = input.nextInt();
        
        
        Persona nuevaPersona = new Persona();
        nuevaPersona.presentarse(nombre, apellido, edad);
        */
        
    // c)

        /*    	    	
    	String[] productos = {"Pritty","Manzana","Calabacin","Shampoo"};
    	int[] cantidad = {1,1,1,1};
    	double[] precios = {500,600,1000,2000};
    	String[] areas = {"gaseosas","frutas","verduras","limpieza"};
    	
    	
    	Comprar compra1 = new Comprar("Fernando Luna", productos, cantidad, precios, areas);
    	compra1.mostrarCompra();
    	
        */
    	
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

