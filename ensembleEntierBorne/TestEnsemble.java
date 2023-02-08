package ensembleEntierBorne;

public class TestEnsemble {
	public static void main(String [] args )
	{
		EnsembleEntierBorne test1 = new EnsembleEntierBorne(15);
		EnsembleEntierBorne test2 = new EnsembleEntierBorne(15);
		
		//test ADD
		
		for(int i = 0 ; i<10 ;i++)
		{
			test1.add(i);
		}
		
		
		for(int i = 4 ; i<14 ;i++)
		{
			test2.add(i);
		}
		
		//test toString
		
		System.out.println("Déclaration des deux tableaux :  ");
		System.out.println(test1.toString());
		
		System.out.println(test2.toString());
		
		System.out.println("-----------------------------------");
		
		//test intersect
		
		System.out.println("Intersection des deux tableaux :  ");
		
		System.out.println(test1.intersect(test2));
		
		System.out.println("-----------------------------------");
		//remove
		
		test1.remove(5);
		test2.remove(11);
		System.out.println("Enleve le 5 du test 1 et le 11 du test 2 : ");
		
		System.out.println(test1.toString());
		
		System.out.println(test2.toString());
		
		System.out.println("-----------------------------------");
		
		// test doesConatin
		System.out.println("Test 1 contient l'element 2  :");
		
		System.out.println(test1.doesContain(2));
		
		System.out.println("-----------------------------------");
		
		
	}

}
