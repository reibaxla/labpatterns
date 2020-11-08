package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		Observable pazientea = new Covid19Pacient("Xabier", 20);
		new PacientObserverGUI(pazientea);
		new PacientSymptomGUI(pazientea);
		new PacientThermometerGUI(pazientea);
		new SemaphorGUI(pazientea);
		
		
		Observable pazientea2 = new Covid19Pacient("Oier", 50);
		new PacientObserverGUI(pazientea2);
		new PacientSymptomGUI(pazientea2);
		new PacientThermometerGUI(pazientea2);
		
		Observable pazientea3 = new Covid19Pacient("Unai", 90);
		new PacientObserverGUI(pazientea3);
		new PacientSymptomGUI(pazientea3);
		new PacientThermometerGUI(pazientea3);
		 
		Observable pazientea4 = new Covid19Pacient("Maria", 21);
		new PacientObserverGUI(pazientea4);
		new PacientSymptomGUI(pazientea4);
		new PacientThermometerGUI(pazientea34;
		
	}


}
