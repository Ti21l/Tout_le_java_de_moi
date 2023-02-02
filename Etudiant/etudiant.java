package Etudiant;

public class etudiant {
	
	private String nom ;
	
	public etudiant(String name)
	{
		nom = name;
	}
	
	public void travailler()
	{
		System.out.println(this.nom + " se met au travail !");
		
	}
	
	public void seReposer()
	{
		System.out.println(this.nom + " se repose !");
		
	}
	
	public static void main(String[] args)
	{
		etudiant nom = new etudiant(args[0]);
		
		nom.travailler();
		nom.seReposer();
		
	}

}
