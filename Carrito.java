package primerProyecto;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
	public List<ItemCarrito> items;
	public Descuento descuentoPorcentual;
	
	public Carrito() {
		items = new ArrayList<>();
	}

	//void ya que no hago el return
	public void addItem(ItemCarrito item) {
		items.add(item);
	}
	
	public void addDescuento(Descuento descuentoPorcentual) {
		this.descuentoPorcentual = descuentoPorcentual;	
	}
	
	public double precioTotal() {
		double precioFinal = 0;
		
		for(ItemCarrito item : items) {
			precioFinal += item.getTotalProductQuantity();
		}
		//Averiguar pero !descuentoPorcentual no me funciona para la validacion no sera como en javascript?
		if(descuentoPorcentual != null) {
			precioFinal = descuentoPorcentual.getTotalConDescuento(precioFinal);
		}
		return precioFinal;
			
	}
	
	public void mostrarCarrito() {
	    for(ItemCarrito item : items) {
	        System.out.println("Producto: " + item.getProduct().getProduct() + 
	                           ", Precio unitario: " + item.getProduct().getProductPrice() + 
	                           ", Cantidad: " + item.getCantidad() + 
	                           ", Precio total: " + item.getTotalProductQuantity());
	    }
	}
	
	
	
	
}


