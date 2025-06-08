package ejIteradorPares;

import java.util.*;

public class RangoPares implements Iterable<Integer> {

	private int inicio;
	private int fin;

	public RangoPares(int inicio, int fin) {
		this.inicio = inicio;
		this.fin = fin;
	}

	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			// Se inicializa current al primer número par >= inicio
			private int current = (inicio % 2 == 0) ? inicio : inicio + 1;

			public boolean hasNext() {
				// Mientras current esté dentro del rango hay siguiente
				return current <= fin;
			}

			public Integer next() {
				int temp = current; // Guarda el valor actual par
				current += 2; // Avanza al siguiente número par
				return temp; // Retorna el número par almacenado previamente
			}
		};
	}

}
