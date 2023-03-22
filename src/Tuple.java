import java.util.Hashtable;
import java.util.Vector;

public class Tuple {
	
	Hashtable<String,String> fields;
	Vector<Vector> attributes;
	
	public Tuple() {
		
	}
	
	public static void main(String[]args) {
		int x = 200;
		System.out.println(((Object)x).getClass().getName());
	}

}
