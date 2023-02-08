package compte;

public class Compte {
	
    public int solde;
	public Compte(int solde, String nom) {
		super();
		this.solde = solde;
		this.nom = nom;
	}

	public String nom;
	


	void deposer(int montant) {
	 solde += montant;
	 }

	void retirer(int montant) {
	 solde -= montant;
	 }

	void virerVers(int montant, Compte destination) {
	 this.retirer(montant);
	 destination.deposer(montant);
	 }

	void afficher() {
	 System.out.println("Solde du compte de " + this.nom + " = "  +solde);
	 }
	

}
