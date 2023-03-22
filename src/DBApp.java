import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

public class DBApp {
	
	Vector<Table> tables;
	
	public void createTable(String strTableName,
			 String strClusteringKeyColumn,
			Hashtable<String,String> htblColNameType,
			Hashtable<String,String> htblColNameMin,
			Hashtable<String,String> htblColNameMax )
			 throws DBAppException{
		
		Table newTable = new Table(strTableName,strClusteringKeyColumn,htblColNameType);
		tables.add(newTable);
		
	}
	
	
	public void createIndex(String strTableName,
			String[] strarrColName) throws DBAppException{
		
	}
	
	
	public void insertIntoTable(String strTableName,
			 Hashtable<String,Object> htblColNameValue)
			 throws DBAppException{
		
	}
	
	
	public void updateTable(String strTableName,
			 String strClusteringKeyValue,
			Hashtable<String,Object> htblColNameValue )
			throws DBAppException {
		
	}
	
	
	public void deleteFromTable(String strTableName,
			 Hashtable<String,Object> htblColNameValue)
			 throws DBAppException {
		
	}
	
	
	public Iterator selectFromTable(SQLTerm[] arrSQLTerms,
			 String[] strarrOperators)
			throws DBAppException{
		
				return null;
		
	}

	public static void main(String[]args) {
		Hashtable<String,String> htblColNameType = new Hashtable( ); 
		htblColNameType.put("id", "java.lang.Integer"); 
		htblColNameType.put("name", "java.lang.String"); 
		htblColNameType.put("gpa", "java.lang.double"); 
		
		
	}

}
