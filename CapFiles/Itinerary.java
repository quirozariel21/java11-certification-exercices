import java.io.*;
import java.util.*;

public class Itinerary {
	
	private List<String> activities = new ArrayList<>();

	private static Itinerary getItinerary(String name) {
		return null;
	}

	public static void printItinerary() throws Exception{

		Console c = new Console(); // NOT COMPILE because it is bad declarated
		 						   // Console console = System.console(); OK		
		final String name = c.readLine("What isyour name?");
		final var stuff = getItinerary(name);
		stuff.activities.forEach(s -> c.printf(s));
	}

	public static void main(String[] args) throws Exception{
		printItinerary();
	}
}

