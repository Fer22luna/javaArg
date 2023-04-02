package primerProyecto;
import java.util.Scanner;

public class AlsoMain {
	public static void main( String [] args) {
     
//a.) Aca nos creamos el array luego usando el for asignamos valores a cada posicion del array, solo sumamos de a 1.
		int[] array = new int[15];
		for(int i = 0; i< array.length; i++) {
			array[i]= i+1;
			System.out.println(array[i]);
		}
//b.) Aca solo vamos incrementando en 5 cada valor mientras aumentamos una posicion.
		int[] array2 = new int[15];
		
		for(int i = 1; i< array2.length; i++) {
			array2[i]= i*5;
			System.out.println(array2[i]);
		}
//c.) Aca generamos el array, usamos el for para asignarles valores. Aca el indice 5, es la posicion 6 ya que comienzo a contar del cero.
		
		int[] array3 = new int[10];
		for(int i = 0; i< array3.length; i++) {
			array3[i]= i+1;
			array3[5]= array3[5]/3;
			System.out.println(array3[i]);
		}
//d.)	
		
		Scanner input= new Scanner(System.in); // Aca uso la clase Scanner y me creo un objeto totalProductos y usamos System.in como fuente de entrada
		System.out.println("Ingrese el total de productos ");
		int n = input.nextInt();  // El nextINt nos permite leer el valor ingresado y luego la almacenamos en la variable n
		input.nextLine(); 
		// Ahora me creo los arrays correspondientes 

		String[] productos = new String[n];
		int[] precios = new int[n];
		
		// lo siguiente que hacemos es como en los ejercicios anteriores usamos un for para asignarle valores 
		// pero estos valores vamos a tenerlos que ingresar en input igual que en la primera parte de este ejercicio.
		
		for (int i = 0; i< n; i++) {
			System.out.println("Ingrese un producto : ");
			productos[i] = input.nextLine();
			System.out.println("Ingrese su precio : ");
			precios[i] = input.nextInt();
			input.nextLine(); 
		}
		for (int i = 0; i< n; i++) {
			System.out.printf("El producto :  %s  y tiene un precio : $ %d . ", productos[i] ,precios[i]);
		}
		
		
// e.)
		
		String[] cursos = {"java","javascript","julia"};
		int[] notasCursos = {10,6,8};
		int total = 0;
		for (int i = 0; i< cursos.length; i++) {
			total = notasCursos[i] + total;
			System.out.printf("La nota el curso : %s es : %d .%n",cursos[i],notasCursos[i] );
		}
		int promedio = total/cursos.length;
		
		System.out.printf("El promedio de los cursos es : %s", promedio);		
	}
}


