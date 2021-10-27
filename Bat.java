public class Bat extends Mammal{
    public Bat(int energyLevel) {
		super(300);
	}
    public void fly() {
		System.out.println("I am flying");
		energyLevel -= 50;
	}
	public void eatHumans() {
		System.out.println("Bat is eating humans");
		energyLevel += 25;
	}
	public void attackTown() {
		System.out.println("Bat is attacking a town");
		energyLevel -= 100;
	}
	

}