package observer;

public class Controller {

	public static void main(String[] args) {
		WetterdatenModel subjekt = new WetterdatenModel();
		WetterOberflaeche beobachter = new WetterOberflaeche();
		
		//beobachter anmelden
		subjekt.addPropertyChangeListener(beobachter);
		
		subjekt.setMesswerte(15);
		subjekt.setMesswerte(19);

	}

}
