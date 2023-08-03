class Mammal {}
class Bat extends  Mammal {}
class Cat extends Mammal {}
class Sat {}

class Fur<? extends Mammal> { // Fails in this line because ? is not allowed, should be T


	void clean() {
		var bat = new Fur<Bat>();
		var cat = new Fur<Cat>();
		var sat = new Fur<Sat>();
	}
}