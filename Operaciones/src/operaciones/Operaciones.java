package operaciones;

public class Operaciones {

	public static void main(String[] args) {
		
		
		//declarar dos variables de tipo int con valores fijoes
		//calculamos la suma
		//mostramos el resultado por pantalla
		
		int n1= 3;
		int n2= 7;
		int n3= 8;
		int suma;
		int resta;
		int multi;
		int divis;
		
		suma = n1+n2;
		System.out.println("La suma es: " + suma);
		
		//a la suma le restamos 8
		
		resta= suma-n3;
		System.out.println("La resta es: " + resta);
		
		multi= suma*n1;
		divis= suma/n2;
		
		System.out.println("La multiplicación es: "+multi);
		System.out.println("La división es: "+divis);
		
	}

}
