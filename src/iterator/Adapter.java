package iterator;

import java.util.List;

import adapter.InvertedIterator;
import domain.Symptom;

public class Adapter implements InvertedIterator {

	List<Symptom> sintomak;
	int position;
	
	public Adapter(List<Symptom> s) {
		this.sintomak = s;
		this.position = s.size()-1;
	}
	
	@Override
	public Object previous() {
		// TODO Auto-generated method stub
		Symptom sintoma = sintomak.get(position);
		position--;
		return sintoma;
	}

	@Override
	public boolean hasPrevious() {

		if(position == 0)
			return false;
		else
			return true;
	}

	@Override
	public void goLast() {
		// TODO Auto-generated method stub
		this.position=this.sintomak.size()-1;
		
	}

	
}
