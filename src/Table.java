import java.util.Vector;

public class Table {
	
	String primaryField;
	private Vector<Page> Pages;
	
	
	public Table() {
		this.Pages = new Vector<Page>();
	}


	public Vector<Page> getPages() {
		return Pages;
	}


	public void setPages(Vector<Page> pages) {
		Pages = pages;
	}
	
	
}
