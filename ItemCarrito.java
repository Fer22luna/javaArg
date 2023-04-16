package primerProyecto;

public class ItemCarrito {
	public Producto product;
	public int cantidad;
	
	public ItemCarrito(Producto product, int cantidad) {
		this.product = product;
		this.cantidad= cantidad;
		
	}
	
	public int getCantidad() {
		return cantidad;
	}
	

	
	public double  getTotalProductQuantity() {
		return product.getProductPrice()*cantidad;
	}
}


