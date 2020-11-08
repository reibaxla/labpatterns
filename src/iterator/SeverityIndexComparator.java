package iterator;

import java.util.Comparator;

import domain.Symptom;

public class SeverityIndexComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		//a negative integer, zero, or a positive integer as thefirst argument is less than, equal to, or greater than thesecond.

		int s1= ((Symptom) o1).getSeverityIndex();
		int s2= ((Symptom) o2).getSeverityIndex();
		
		if(s1<s2)
			return 1;
		else if (s1>s2)
			return -1;
		else
			return 0;
		
	}

}
