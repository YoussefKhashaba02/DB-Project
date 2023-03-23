import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class Tuple {
	
	Hashtable<String,String> fields;
	Vector<Vector> attributes;
	
	public Tuple(Hashtable<String,String> fields , Hashtable<String,String> values) {
		Set<String> setOfKeys = ((Map<String, String>) fields).keySet();
		for (String key : setOfKeys) {
            Object value = (String) values.get(key);
            String desiredType = fields.get(key);
            
            if(!desiredType.equals(value.getClass().getName())) {
            	return;
            }
           
        }
		
		
	}
	
	public static void main(String[]args) {
		int x = 200;
		System.out.println(((Object)x).getClass().getName());
	}

}
