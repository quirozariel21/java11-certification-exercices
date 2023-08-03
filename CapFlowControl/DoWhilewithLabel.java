public class DoWhilewithLabel {
	public static void main(String args[]) {
		var race = "";
		loop:
		do {
			race += "x";
			break loop;
		} while(true);
		System.out.println(race); // print x
	}
}