package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		Observable pazientea = new Covid19Pacient("Xabier", 20);
		PacientObserverGUI pacientGUI = new PacientObserverGUI(pazientea);
		PacientSymptomGUI sympGUI = new PacientSymptomGUI(pazientea);
		
		Observable pazientea2 = new Covid19Pacient("Oier", 21);
		PacientObserverGUI pacientGUI2 = new PacientObserverGUI(pazientea2);
		PacientSymptomGUI sympGUI2 = new PacientSymptomGUI(pazientea2);
		
	}


}
