package arrays;

import java.util.Arrays;

public class ArraysTest {
  public static void main(String[] args) {
    int[] T1 = new int[10];
    String[] T2 = new String[7];
    int[] T3 = {0, 6, 2, 4, 3};
    String[] T4 = {"bleu", "rouge", "blanc", "vert", "mauve", "indigo"};

    // Remplir T1 avec l'entier 5 dans toutes les cases.
    Arrays.fill(T1, 5);
    System.out.println("T1 apres etre remplie avec 5: " + Arrays.toString(T1));

    // Remplir T2 avec la chaîne de caractères "bleu" dans les cases d'indices 1 et 2.
    for (int i = 1; i <= 2; i++) {
      T2[i] = "bleu";
    }
    System.out.println("T2 remplie avec bleu dans les cases 1 et 2: " + Arrays.toString(T2));

    // Afficher les tableaux
    System.out.println("T3: " + Arrays.toString(T3));
    System.out.println("T4: " + Arrays.toString(T4));

    // Trier T3 dans l'ordre croissant
    Arrays.sort(T3);
    System.out.println("T3 dans l'ordre croissant: " + Arrays.toString(T3));

    // Trier T4 dans l'ordre alphabétique
    Arrays.sort(T4);
    System.out.println("T4 dans l'ordre alphabétique: " + Arrays.toString(T4));

    // Vérifier si T1 et T3 sont égaux
    System.out.println("T1 et T3 sont égaux: " + Arrays.equals(T1, T3));

    // Copier les 5 premiers éléments de T4 dans un nouveau tableau T5
    String[] T5 = Arrays.copyOfRange(T4, 0, 5);
    System.out.println("T5 apres copie des 5 premiers elements de T4: " + Arrays.toString(T5));

    // Dupliquer T4 dans un tableau T6 et vérifier s'ils sont égaux
    String[] T6 = Arrays.copyOf(T4, T4.length);
    System.out.println("T4 et T6 sont égaux : " + Arrays.equals(T4, T6));
  }
}
