package dynamicTable;


public class Main {
	
	
	
	
	
	public static void main(String[] args)
	{
		
		
		
		int [] tab = { 1,4,8,9,4,5};
		
		DynamicTable processTable = new DynamicTable(tab);
		
		
		int [] tab2 = {7,7,7};
		
		System.out.println("Table entrée : ");
		
		processTable.printTable();
		
		System.out.println("Table Triée : ");
		
		processTable.sort();
		processTable.printTable();
		
		
		
		
		int [] result = processTable.concat(tab2);
		
		
		DynamicTable processTable2 = new DynamicTable(result);
		
		System.out.println("Table 1 concatenée avec table 2 puis triée : ");
		
		
		processTable2.sort();
		processTable2.printTable();
		
		System.out.println("Supression de la donnée de la table a l'index donnée ");
		
		if (processTable2.deleteAtIndex(7) == true ) 
		{
			processTable2.printTable();
		}
		
		
	
		
		
		
	}
	
	
	

}
