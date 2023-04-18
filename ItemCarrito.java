package primerProyecto;

public class ItemCarrito extends Producto {
	//public Producto product;
	public int cantidad;
	
	/*
	public ItemCarrito(Producto product, int cantidad) {
		
		this.product = product;
		this.cantidad= cantidad;
	}*/
	public ItemCarrito(String nombre, double precio, int cantidad) {
        super(nombre, precio);

		//this.product = product;
		this.cantidad= cantidad;
	}
	
	

	public int getCantidad() {
		return cantidad;
	}
	/*
	public Producto getProduct() {
		return product;
	}*/
	
	public double  getTotalProductQuantity() {
		return getProductPrice()*cantidad;
	}
}


