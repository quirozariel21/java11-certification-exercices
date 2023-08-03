public class Dinosaur {
	
	class Pterodactyl extends Dinosaur {}

	public void roar() {
		var dino = new Dinosaur();

		//The code COMPILE with these options
		//Option 1
		dino.new Pterodactyl();

		//Option 2
		new Dinosaur.Pterodactyl();
	}
}