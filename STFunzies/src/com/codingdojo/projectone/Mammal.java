package com.codingdojo.projectone;

public class Mammal {
	protected int energyLevel = 100;

	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
}
