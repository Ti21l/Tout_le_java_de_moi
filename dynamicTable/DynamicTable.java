package dynamicTable;

public class DynamicTable {
	
	private int tab[];
	
	
	
    public DynamicTable(int [] table){
    	
    	this.tab = table ; 
    		
    }

    public void sort() {
        int tableLenght = tab.length;

        for (int i = 1; i < tableLenght; i++) {
            int index = tab[i];
            int j = i-1;

            while(j >= 0 && tab[j] > index) {
                tab[j+1] = tab[j];
                j--;
            }
            tab[j+1] = index;
        }
    }

    public int[] concat(int [] tab2){
    	
    	
    	
        int[] result = new int[tab.length+tab2.length];
        System.arraycopy(tab,0, result, 0, tab.length);

        for(int i=0; i < tab2.length; i++){
            result[tab.length + i] = tab2[i];
        }
        return result;
    }

    public void printTable(){
    	
        for(int i=0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
    
    
    public boolean deleteAtIndex (int index )
    {
    	
    	int [] result = new int [tab.length-1];
    	
    	if(index > tab.length  )
    	{
    		System.out.println("Erreur :  l'index donné est superieur à la taille du  tableau");
    		return false ;
    	}
    	
    	
    	for(int i  = 0 ; i < tab.length-1 ; i++)
    	{
    		if(i >= index && i < tab.length-1)
    		{
    			result[i]=tab[i+1];
    		}
    		else
    		{
    			result[i]=tab[i];
    		}
    	}
    	
    	tab =  result ;
    	return true ; 
    }
    
    

}


