import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModification{
	
	public static void main(String args[]) {

		//var foodData = new HashMap<String, String>(); // Error: Exception in thread "main" java.util.ConcurrentModificationException
		var foodData = new ConcurrentHashMap<String, String>();
		foodData.put("1", "banana");
		foodData.put("2", "apple");
		foodData.put("3", "banana");
		System.out.println("----- INPUT -----");
		System.out.println(foodData);
		foodData.putIfAbsent("4", "banana"); // This method checks if the key already exists inn the Map and if it does, does nothing in other words
											// this method does not overwrite a key with new value. The check and update happens atomically.	
		System.out.println(">>> putIfAbsent = " + foodData);


		for(String key: foodData.keySet()) {
			foodData.remove(key); // We can remove the elements while we are iterating the HashMap
		}

		System.out.println("----- OUTPUT -----");
		System.out.println(foodData);
	}
}