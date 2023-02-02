package point;


public class Point {
	
	private double x ;
	private double y ; 
	

	
	
	public Point() {
		
		x = 0;
		y = 0;
		
	}
	
	
	public Point(double x, double y) {
		
		this.x = x ;
		this.y = y ; 
		
	}
	
	public double getDistance(Point p) {
		
		return Math.sqrt(Math.pow(this.x - p.x,2)+Math.pow(this.y - p.y, 2));
		
	}
	
	public void afficher()
	{
		System.out.println(x + "," + y);
	}
	
	
	public double getX()
	{
		return x;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}


	public double getY()
	{
		return y;
	}
	
	
	public Point projX()
	{
		Point projx = new Point(x,0.0);
		return projx ;
	}
	
	public Point projY()
	{
		Point projy = new Point(0.0,y);
		return projy ;
	}
	
	public Point getLocation()
	{
		Point point_loc = new Point(getX(),getY());
		return point_loc ; 
	}
	
	public void setLocation(Point p)
	{
		x = p.x;
		y = p.y;
		
	}
	
	public void setLocation(double x, double y) 
	{
		this.x = x;
		this.y = y ;
		
	}
	
	public void translate(int dx, int dy)
	{
		this.x = this.x + dx ;
		this.y = this.y + dy ;
		
		
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
  translate, le move et equals , ainsi que des methodes ayant le meme fonctionnement mais 
  pas de la meme maniere tel que setLocation
  
  
  
*/


