package primerProyecto;

public class Comprar {
	// aca guardo las atributos de la clase
	   public String nombreCliente;
	   public String[] productos;
	   public int[] cantidad;
	   public double[] precios;
	   public String[] areas;

	   // Aca me creo el constructor, que se pasa a ejecutar cuando se instancia el objeto
	   //aca el this me hace referencia al atributo de la clase
	   public Comprar(String nombreCliente, String[] productos,  int[] cantidad,double[] precios, String[] areas) {
	      this.nombreCliente = nombreCliente;
	      this.productos = productos;
	      this.precios = precios;
	      this.cantidad = cantidad;
	      this.areas = areas;
	   }
	   
	    public double totalConDescuento() {
	    	 
	         double total = 0.0;
	         
	         for (int i = 0; i < productos.length; i++) {     	 
	   	     if (areas[i] == "frutas" || areas[i]=="verduras"|| areas[i]=="gaseosas") {

	   	         // aca no me salio el > 1000, si queria poner :  (total>1000 & (areas[i] == "frutas" || areas[i]=="verduras"|| areas[i]=="gaseosas")
	   	    	 // al principio iba a ser mayor que 1000, no estaba seguro como hacerlo, si era un producto y con cantidad si ,pero con varios productos se me complico. 
	   	    	 
	   	    	 total += (precios[i] * cantidad[i])*0.8;  // aca calculo el 20% si estan en estas areas sino se suma normal
	             
	         }else {
	             total += precios[i] * cantidad[i]; 
	         }}
	         
	         return total;
	     }
	   
	    public int totalCantidad() {
	    	
	    	int total = 0;
	    	
	    	for(int i = 0; i< cantidad.length; i++ ) {	    	
	    		total += cantidad[i];
	    	}
	    	return total;
	    }
	    
	    
	    
	   public void mostrarCompra() {
		  double total = totalConDescuento();
		  int cantidadTotal = totalCantidad();
	      System.out.println("Nombre del cliente: " + nombreCliente);
	      System.out.println("Total de productos llevados: " + cantidadTotal);
	      System.out.println("Total a pagar: $" + total);
	   }
	}



