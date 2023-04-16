package primerProyecto;

public class Producto {
	
	//Aca en los atributos de la clase solo puse nombre y precio del producto, son los intrinsecos a la clase, la cantidad ya depende de cuanto ingreses en el carrito
	public String nombre;
	public double precio;

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	};
	
	
	public String getProduct() {
		return nombre;
	}
	
	public double getProductPrice() {
		return precio;
	}
	
	
}


