package primerProyecto;

import java.util.Scanner;

public class MainCarrito {
	public static void main( String [] args) {
   

		Scanner input= new Scanner(System.in);
		
		
		Producto[] allProducts = new Producto[3];
		for(int i=0; i<3; i++) {
			
			System.out.println("Ingrese el producto : " +  (i+1) );
			String nombre = input.nextLine();
			System.out.println("Ingrese el precio del producto :" + nombre);
			double precio = input.nextDouble();
	        input.nextLine();
			allProducts[i] = new Producto(nombre,precio);
		}
		
		for(int i=0; i<3; i++) {
			
			System.out.println(allProducts[i].getProduct() + "   " + allProducts[i].getProductPrice());
		}
		
		Carrito carrito = new Carrito();
		
		for (int i=0; i<3; i++) {
		System.out.println("Ingrese la cantidad del producto: " + allProducts[i].getProduct());
		int cantidad = input.nextInt();
		ItemCarrito item = new ItemCarrito(allProducts[i], cantidad);
		carrito.addItem(item);
		System.out.println("El producto : "+  allProducts[i].getProduct() + "  Con el precio unitario  " + allProducts[i].getProductPrice() + " y la cantidad  " + item.getCantidad());
	
		}
		input.nextLine();
		
		System.out.println("Aplicamos el descuento ? si/no");
		String respuesta = input.nextLine();
		
		if(respuesta.equals("si")) {
			System.out.println("INgrese la cantidad de descuento ");
			double descPorcentaje = input.nextDouble();
			Descuento descuento = new Descuento(descPorcentaje);
			carrito.addDescuento(descuento);
			
			System.out.println("El total es : " + carrito.precioTotal());

		}else {
		
			System.out.println("El total es : " + carrito.precioTotal());

			
		}
		
	
	
		
		

		
	}
}
