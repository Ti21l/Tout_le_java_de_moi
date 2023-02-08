package compte;

public class TestCompte {
	
	public static void main(String [] args)
	{
		
		int solde1 = 10000;
		int solde2 = 50;
		
		
		Compte compteTitouan = new Compte(101000, "titouan");
		Compte compteThomas = new Compte(20,"thomas");
		
		//compteTitouan.deposer(solde1);
		//compteThomas.deposer(solde2);
		
		
		
		compteTitouan.deposer(500);
		//compteTitouan.afficher();
		
		compteThomas.deposer(1000);
		//compteThomas.afficher();
		
		compteThomas.retirer(10);
		
		compteTitouan.virerVers(75, compteThomas);
		
		//compteThomas.virerVers(2000, compteTitouan);
		
		
		compteTitouan.afficher();
		compteThomas.afficher();
		
		Compte [] compteTab = new Compte[10];
		
		for(int i = 0 ; i < 10 ; i++ )
		{
			compteTab[i]  = new Compte(0, i+"");
			compteTab[i].deposer(200 + 100*i);
		}
		
		for(int i = 0 ; i < 9 ; i++)
		{
			compteTab[i].virerVers(20, compteTab[i+1]);
			
		}
		
		for(int i = 0 ; i<10 ; i++) compteTab[i].afficher();
		
		
		
		
		
		
		
		
	}
	
	

}
