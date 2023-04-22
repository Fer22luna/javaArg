package primerProyecto;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.InputMismatchException;

public class MainCarrito {
	public static void main( String [] args) {
   

		Scanner input= new Scanner(System.in);
		
		
		Producto[] allProducts = new Producto[3];
		
		String nombre = "";
		double precio = 0.0;
		// Aca inicializo las varibles de manera global para no tener problemas en el try-catch
		
		for(int i=0; i<3; i++) {
			
		
			System.out.println("Ingrese el producto : " +  (i+1) );
		     nombre = input.nextLine();
    	
		     // Aca me veo obligado a poner expresiones regulares, tambien pude poner la version de expresiones para que acepten caracteres especiales
	         //  y el Pattern ya que no tengo manera de validar con un InstanceOf ( como el typeof en Javascript  o type en Python) ya que todo lo que entra 
		     // en el input del nextLine aunque sean numeros lo pasa a caracter.
		     if (!Pattern.matches("[a-zA-Z]+", nombre)) {
	                System.err.println("El nombre del producto debe ser una cadena de caracteres. Intentelo de nuevo");
	                i--;
	                continue;
	            } 
		     
		try{
			
			System.out.println("Ingrese el precio del producto : " + nombre);
		    precio = input.nextDouble();
	        input.nextLine();
			allProducts[i] = new Producto(nombre,precio);

	    } catch (InputMismatchException e) {
	        System.out.println("El precio debe ser un número. Inténtelo de nuevo.");
	        input.nextLine();
	        i--;
	        continue;
	    }}      
	        
	    Carrito carrito = new Carrito();
		
		for (int j=0; j<3; j++) {
			
		try {	
			System.out.println("Ingrese la cantidad del producto: " + allProducts[j].getProduct());
			int cantidad = input.nextInt();
			ItemCarrito item = new ItemCarrito(allProducts[j].getProduct(),allProducts[j].getProductPrice(), cantidad);
			carrito.addItem(item);
			System.out.println("El producto : "+  allProducts[j].getProduct() + "  Con el precio unitario  " + allProducts[j].getProductPrice() + " y la cantidad  " + item.getCantidad());
		}
		catch (InputMismatchException e) {
	        System.err.println("La cantidad debe ser un numero entero . Intentelo de nuevo.");
	        input.nextLine();
	        j--;
	        continue;
	    }}
		
		
		
		input.nextLine();
		
		String respuesta = "";
		// Aca use un do while ya que hasta que no matchea el type con la expresion regular no procede.
		
		do {
			System.out.println("Aplicamos el descuento ? si/no");
			respuesta = input.nextLine();
			
		     if (!Pattern.matches("[a-zA-Z]+", respuesta)) {
	                System.err.println("La respuesta tiene que ser si o no en caracter . Intentelo de nuevo");
	
	            } 
					
		}while (!Pattern.matches("[a-zA-Z]+", respuesta)); 
           
         
	
		if(respuesta.equals("si")) {
			
			try {
				System.out.println("INgrese la cantidad de descuento ");
				double descPorcentaje = input.nextDouble();
				Descuento descuento = new Descuento(descPorcentaje);
				carrito.addDescuento(descuento);
			
				System.out.println("El total es : " + carrito.precioTotal());
				
			} catch (InputMismatchException e) {
		        System.err.println("La cantidad de descuento debe ser un número.");
		        input.nextLine();
		        
			}
			
		}else {
		
			System.out.println("El total es : " + carrito.precioTotal());
		
		}
		
		carrito.mostrarCarrito();
		
	}
}
