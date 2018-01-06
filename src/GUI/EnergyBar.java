package GUI;

import java.awt.Color;

public class EnergyBar extends GenericBar{
	
	public EnergyBar() {
		super("Energy", Color.blue);
	}
	public void setEnergy(int energy) {
		this.updateValue(energy);
	}
	public int getEnergy() {
		return this.value;
	}
}
