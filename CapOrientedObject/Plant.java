public class Plant {
	String type = "plant";

	public static void main(String args[]) {
		Plant w1 = new Bush();
		Bush w2 = new Bush();
		Plant w3 = w2;

		System.out.println(w1.type + "," + w2.type + "," + w3.type); // print plat, bush, plant
	}
}

class Bush extends Plant {
	String type = "bush";
}