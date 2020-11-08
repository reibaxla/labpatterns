package iterator;

import java.util.Comparator;
import domain.Symptom;

public class SymptonNameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		//a negative integer, zero, or a positive integer as thefirst argument is less than, equal to, or greater than thesecond.
		
		String sintoma1 = ((Symptom) o1).getName();
		String sintoma2 = ((Symptom) o2).getName();
		
		return sintoma1.compareTo(sintoma2);
	}

}
