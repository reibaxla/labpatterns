package observer;

import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import domain.Covid19Pacient;
import domain.Symptom;

import javax.swing.JLabel;

public class PacientObserverGUI extends JFrame implements Observer{

	private JPanel contentPane;
	private final JLabel symptomLabel = new JLabel("");

	/**
	 * Create the frame.
	 */
	public PacientObserverGUI(Observable obs) {
		setTitle("Pacient symptoms");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 100, 200, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		symptomLabel.setBounds(19, 38, 389, 199);
		contentPane.add(symptomLabel);
		symptomLabel.setText("Still no symptoms");
		this.setVisible(true);
		obs.addObserver(this);
	}

	public void update(Observable o, Object arg) {
		Covid19Pacient p=(Covid19Pacient)o;
		Iterator<Symptom> i=p.getSymptoms().iterator();
		Symptom p2;
		String s="<html> Pacient:<b>"+p.getName()+"</b> <br>";
		s=s+"Covidimpact: <b>"+p.covidImpact()+"</b><br>";
		s=s+"Symptoms: <br>";
		while(i.hasNext()) {
			p2=i.next();
			s=s+p2.toString()+", "+p.getWeight(p2)+"<br>";
		}
		s=s+"</html>";
		symptomLabel.setText(s);}

}
