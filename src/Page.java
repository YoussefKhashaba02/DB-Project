import java.util.Hashtable;
import java.util.Vector;


public class Page {
	private Vector<Hashtable> records;
	int size;
	int maxSize = 200;
	
	
	public Page() {
		size = 0;
		this.records = new Vector<Hashtable>() ;
	}

	public Vector<Hashtable> getRecords() {
		return records;
	}

	public void setRecords(Vector<Hashtable> records) {
		this.records = records;
	}
	
	public boolean isEmpty() {
		
	}
	
}
