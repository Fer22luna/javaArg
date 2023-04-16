package primerProyecto;

public class Descuento {
		public double descuentoPorcentual;
		
		public Descuento( double descuentoPorcentual) {
			this.descuentoPorcentual = descuentoPorcentual;
		}
		
		public double getTotalConDescuento(double total) {
			
// Aca por ejemplo si el descuento es del 10%, me da total*0.9 y eso es la cantidad del total descontandole el descuento
			return total*(100 -descuentoPorcentual)/100;	
		}
		
}



