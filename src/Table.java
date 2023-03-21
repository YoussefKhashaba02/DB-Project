import java.io.Serializable;
import java.util.Hashtable;
import java.util.Vector;

public class Table implements Serializable {
	
	String tableName;
	transient String primaryField;
	Hashtable<String,String> fields;
	private Vector<Page> Pages;
	
	
	public Table(String name , String primary , Hashtable<String,String> fields) {
		this.tableName = name;
		this.primaryField = primary;
		this.fields = fields;
		this.Pages = new Vector<Page>();
		Page p = new Page();
		this.Pages.add(p);
	}


	public Vector<Page> getPages() {
		return Pages;
	}


	public void setPages(Vector<Page> pages) {
		Pages = pages;
	}
	
	
}
