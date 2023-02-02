package point2;

import point.Point;

public class testPoint2 {
	
	public static void main(String[] args)
	{
		Point A = new Point(4.0,6.0);
		Point B = new Point(8.0,9.0);
		
		System.out.println("Coordonnées De A :");
		A.afficher();
		System.out.println("Coordonnées De B :");
		B.afficher();
		
		
		System.out.println(A.getX());
		System.out.println(A.getY());
		
		System.out.println("Distance entre A et B  :");
		System.out.println(A.getDistance(B));
		
		
		System.out.println("Projeté de A sur l'axe des abscisses :");
		System.out.println(A.projX());
		
		
	}
		
		
	

}
