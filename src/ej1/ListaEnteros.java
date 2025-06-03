package ej1;

import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public class ListaEnteros {

	public static void main(String[] args) {

		//ejercicio1
		List<Integer> listaNum = Arrays.asList(1,2,3,4,5);
		
		System.out.println(listaNum);
		System.out.println();
		
		//ejercicio2
		
		HashSet<String> coche= new HashSet<>();
		
		String c1 = new String ("Toyota");
		String c2 = new String ("Toyota");
		String c3 = new String ("Seat");
		String c4 = new String ("Seat");
		
		coche.add(c1);
		coche.add(c2);
		coche.add(c3);
		coche.add(c4);
		
		
		System.out.println(coche.size());
		System.out.println();

		//ejercicio3
		
		List<String> nombres = new ArrayList<>();
		
		nombres.add("Fran");
		nombres.add("Iker");
		nombres.add("Adriano");
		nombres.add("Marina");
		
		for (int i = 0; i < nombres.size(); i ++) {
			
			System.out.println("Nombres: "+nombres.get(i));
			
		}
		System.out.println();

	String[] listaNom = {"Fran","Adriano","Iker","Marina"};
	
		for(String lista:listaNom) {
			
			System.out.println(lista);
			
			
		}
		
	}

}
