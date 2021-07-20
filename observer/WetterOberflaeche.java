package observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class WetterOberflaeche implements PropertyChangeListener {
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		//tu etwas wenn wert sich geaendert hat
		System.out.println("Value Changed! " +evt.getNewValue().toString() +" alter Wert: " +evt.getOldValue() +"\t" +evt.getPropertyName());	
	}
	
}
