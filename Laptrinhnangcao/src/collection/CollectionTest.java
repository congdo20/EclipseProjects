package collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class CollectionTest {
	public static void main(String[] args) {
		ArrayList<String> collection = new ArrayList<>();
		collection.add("Ha Noi");
		collection.add("Hue");
		collection.add("Da Nang");
		collection.add("Ho Chi Minh");
		
		System.out.println("A list of cities in collection: " + collection);
		System.out.println("\nIs Hue in collection? " + collection.contains("Hue"));
		
		collection.remove("Hue");
		System.out.println("There are " + collection.size() + "cities are in collection1 now");;
		System.out.println("A list if cities in collection after remove Hue: " + collection);
		System.out.println("");
		System.out.println("");
		
		
		Collection<String> collec = new ArrayList<>();
		collec.add("Ha Noi");
		collec.add("Hue");
		collec.add("Da Nang");
		collec.add("Ho Chi Minh");
		
		Iterator<String> iterator = collec.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + ", ");
		}
		System.out.println("");
		
		
		
	}
	
}
