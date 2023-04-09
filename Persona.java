package primerProyecto;

public class Persona {
    void presentarse(String nombre, String apellido, int edad) {
        System.out.printf("Nombre completo : %s %s, edad : %d años %n", nombre, apellido, edad);
    	if(edad>18) {
    		System.out.printf("%s %s es mayor de edad", nombre,apellido);
    	}else {
    		System.out.printf("%s %s es menor de edad", nombre,apellido);
    	}
    }
}



