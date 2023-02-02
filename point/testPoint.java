package point;

public class testPoint {
	
	public static void main(String[] args)
	{
		Point A = new Point(4.0,6.0);
		Point B = new Point(8.0,9.0);
		
		System.out.println("Coordonnées De A :");
		A.afficher();
		System.out.println("Coordonnées De B :");
		B.afficher();
		
		System.out.println("X de a  :" + A.getX());
		System.out.println("Y de a  :" + A.getY());
		
		System.out.println("Distance entre A et B  :");
		System.out.println(A.getDistance(B));
		
		System.out.println("Projeté de A sur l'axe des abscisses :");
		System.out.println(A.projX());
		
		
	}

}


/*
L'API Java Standard Edition (SE) 10 est une documentation en 
ligne de l'ensemble des classes, méthodes, interfaces et packages
 disponibles dans le JDK 10 de Java.

Accès: Il est possible d'accéder à la documentation de toutes 
les classes et packages inclus dans Java SE 10, ainsi que les 
informations sur les méthodes et les interfaces associées.

Recherche: Vous pouvez rechercher une classe ou un package 
en utilisant la barre de recherche en haut de la page, ou en 
naviguant manuellement à travers les packages dans l'arborescence de la table des 
matières en haut à gauche.

Descriptif d'une classe: Le descriptif d'une classe inclut une description
 générale de la classe, les constructeurs, les méthodes, les champs, les exemples 
 d'utilisation, etc. Il peut également y avoir des informations sur les exceptions
  générées par les méthodes et les valeurs par défaut pour les paramètres.
  
  
  La classe se situe dans la package java.awt.
  
  les differences avec la classe que l'on a creer est  la presence d'une methode 
  translate et equals 
  
  
  
*/


