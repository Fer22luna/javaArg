package primerProyecto;

public class Calculadora {
	
    double sumar(double unNumero, double otroNumero) {
    	return unNumero + otroNumero;
    }
    double restar(double unNumero, double otroNumero) {
    	return unNumero-otroNumero;

    }
    double multiplicar(double unNumero, double otroNumero) {
    	return unNumero*otroNumero;

    }
    double dividir(double unNumero, double otroNumero) {
    	try {
        	return unNumero/otroNumero;
    		
    	} catch(Exception e){
    		// si uso double no me aparece  java.lang.ArithmeticException: para la excepcion si no me manda infinity.
    		e.printStackTrace(System.out);
    		return 0.0;
    	}
    }
}


