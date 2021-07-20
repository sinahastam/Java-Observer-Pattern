package observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class WetterdatenModel {

	//value to watch
	int temp = 10;
	
	private PropertyChangeSupport support = new PropertyChangeSupport(this);
	
	public void setMesswerte(int temp){
	int alt = this.temp;
	this.temp = temp;
	
	//beobachter informieren
	support.firePropertyChange("temp", alt, temp);
	}
	
	
	//beobachter anmelden
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
	support.addPropertyChangeListener(pcl);
	}
	
	//beobachter abmelden
	public void removePropertyChangeListener(PropertyChangeListener pcl) {
	support.removePropertyChangeListener(pcl);
	}

	
}
