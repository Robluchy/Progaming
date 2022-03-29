package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class BaseArrayList {

	public static void main(String[] args) {


		ArrayList<Integer> arrayEdades = new ArrayList<>();  

		Integer edad1 = 23;
		Integer edad2 = 45;

		arrayEdades.add(edad1);		
		arrayEdades.add(edad2);	
		arrayEdades.add(77);

		System.out.println( arrayEdades );


		arrayEdades.set(1,33);
		System.out.println( arrayEdades );
		System.out.println(edad2);



		//		edad1=10;
		//		System.out.println( arrayEdades );

		System.out.println( arrayEdades.get(2) );

		if( arrayEdades.contains(edad1) ) {
			System.out.println("Encontrado");
		}
		else
			System.out.println("No lo encuentro");


		arrayEdades.remove(0);
		//		arrayEdades.remove(edad1);


		//calcular la media

		//con un for
		int acum =0;
		for (int i = 0; i < arrayEdades.size(); i++) {
			acum += arrayEdades.get(i); // arrayEdades[i]
		}
		System.out.println("La media es: "+ (acum/arrayEdades.size()));

		
		//con un for_each
		acum=0;
		for (Integer edad : arrayEdades) {
			acum += edad; // arrayEdades.get(i)	
		}
		System.out.println("La media es: "+ (acum/arrayEdades.size()));

		acum=0;

		// con iterador
		Iterator<Integer> iterador = arrayEdades.iterator();
		while (iterador.hasNext()) {

			Integer edad =  iterador.next();
			acum += edad; // arrayEdades.get(i)	
		}

		System.out.println("La media es: "+ (acum/arrayEdades.size()));

		//vaciar el ArrayList
		arrayEdades.clear();

		//Añadimos nuevos elementos
		arrayEdades.add(22);
		arrayEdades.add(33);
		arrayEdades.add(45);
		arrayEdades.add(33);
		arrayEdades.add(11);
		arrayEdades.add(45);
		//mostramos por pantalla
		System.out.println( arrayEdades );

		//		int i = 0;
		//		for (Integer edad : arrayEdades) {
		//			
		//			if(edad == 33) {
		//				arrayEdades.remove(i);
		//			}
		//			i++;
		//		}

		// borrar elementos de la lista mientras la recorremos con iterador
		iterador = arrayEdades.iterator();
		while (iterador.hasNext()) {

			Integer edad =  iterador.next();

			if(edad == 33) {
				iterador.remove();
			}
		}

		System.out.println( arrayEdades );



		// Devuelve la posición de la primera ocurrencia ('Elemento') en el ArrayList  
		System.out.println(  arrayEdades.indexOf(edad2) );
		
		// Devuelve la posición de la última ocurrencia ('Elemento') en el ArrayList   
		System.out.println(  arrayEdades.lastIndexOf(edad2) );

		// Devuelve True si el ArrayList esta vacio. Sino Devuelve False   
		arrayEdades.isEmpty(); 

		// Pasa el ArrayList a un vector (se genera un clonado de los elementos )
		Object[] vectorCopia = arrayEdades.toArray();
		
		vectorCopia[0]=9999;
		
		System.out.println("arrayEdades: "+arrayEdades);
		System.out.println("vectorCopia: "+ Arrays.toString(vectorCopia)) ;
		
		//borrar todas las instancias de un elemento dado en el ArrayList utilizando métodos propios
		while( arrayEdades.contains(edad2) ) {
			arrayEdades.remove(edad2);
		}

		System.out.println(arrayEdades);
		
		
		
		
	}

}
