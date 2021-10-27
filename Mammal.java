public class Mammal {
    protected int energyLevel = 50;

    public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}

    public int displayEnergy() {
		System.out.println("Energy Level: " + energyLevel);
		return energyLevel;
	}
	
    
}