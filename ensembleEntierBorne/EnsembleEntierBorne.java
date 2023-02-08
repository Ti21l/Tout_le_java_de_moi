package ensembleEntierBorne;

public class EnsembleEntierBorne {
		
	private int MAXIMUM;
	private boolean [] tab;
	
	public EnsembleEntierBorne(int max)
	{
		this.MAXIMUM = max ;
		tab = new boolean[max+1];
		
	}
	
	
	public void add(int adder )
	{
		if(adder>0 && adder<MAXIMUM)
		{
			tab[adder]=true;
		}
	}
	
	public void remove(int remover)
	{
		if(remover>0 && remover<MAXIMUM)
		{
			tab[remover]=false;
		}
	}
	
	public boolean doesContain(int indice)
	{
		if(tab[indice]==true)
		{
			return true ;
		}
		return false;
	}
	
	public String toString()
	{
		String result = "{" ;
		
		for(int i = 0  ; i<MAXIMUM ; i++)
		{
			if(this.doesContain(i) == true )
			{
				result += "" + i + "," ;
			}
			
		}
		
		result += "}";
		return result ;
	}
	
	
	public EnsembleEntierBorne intersect(EnsembleEntierBorne ensemble)
	{
		int len = Math.min(this.tab.length , ensemble.tab.length);
		EnsembleEntierBorne tmp_tab = new EnsembleEntierBorne(len);
		for(int i = 0 ; i <len; i++)
		{
			if(this.doesContain(i) == true && ensemble.doesContain(i)==true)
			{
				tmp_tab.add(i);
			}
		}
		
		return tmp_tab;
	}
	
	

		
}			
		