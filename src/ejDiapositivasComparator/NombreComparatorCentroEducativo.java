package ejDiapositivasComparator;

import java.util.*;

public class NombreComparatorCentroEducativo implements Comparator<PersonaCentroEducativo> {

	public int compare(PersonaCentroEducativo p1, PersonaCentroEducativo p2) {

		return p1.getNombre().compareTo(p2.getNombre());

	}

}
