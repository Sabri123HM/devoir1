//Exo 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
   public static void main(String args[]) throws IOException{ 
      BufferedReader MenuSelect = new BufferedReader(new InputStreamReader(System.in));
      int choix;

      do { 
         afficherMenu();
         choix =lireValiderEntier (0,4);
         switch (choix) {
            case 1 : additionner();
            break;
            case 2 : soustraire();
            break;
            case 3 : multiplier();
            break;
            case 4 : deviser();
            break;
         } 
      } while (choix!=0);
   } 

   //Confirm
   
   public static int lireValiderEntier(int debut, int fin)throws IOException {
    	int choix ;
      boolean valeur = false;
      BufferedReader MenuSelect = new BufferedReader(new InputStreamReader(System.in));
 
      do {
         choix = Integer.parseInt(MenuSelect.readLine());
         if (choix >= 0 && choix <= 4)
            valeur = true ;
   
         else {
            System.out.print("Refaire le choix : ");
            valeur = false ;
         }
      } while (!valeur);
      return choix;
   }

   //Entier
   
   static int lireNombreEntier()throws IOException {	  
      int nb;
      BufferedReader MenuSelect = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("\n\nEntrez le nombre : ");
      nb = Integer.parseInt(MenuSelect.readLine());
      return nb;  
   }

   // Menu
        
   static void afficherMenu() {
      System.out.println("\n\n\n\t\tMENU CALCULATRICE\n");
      System.out.println("\t1. Additionner deux nombres\n");
      System.out.println("\t2. Soustraire deux nombres\n");
      System.out.println("\t3. Multiplier deux nombres\n");
      System.out.println("\t4. Diviser deux nombres\n");
      System.out.println("\t0. Quitter\n");
      System.out.print("\tFaites votre choix : ");
   }
  
   //Addition
   
   static void additionner() throws IOException {
      BufferedReader MenuSelect = new BufferedReader(new InputStreamReader(System.in));
      int nb1,nb2, resultat;
      nb1=lireNombreEntier();
      nb2=lireNombreEntier();
      resultat = nb1 + nb2;
      System.out.println("\n" + "Ton opération : " + nb1 + " + " + nb2 + " = " + resultat);
   }

   //Soustraction

   static void soustraire()throws IOException {
      BufferedReader MenuSelect = new BufferedReader(new InputStreamReader(System.in));
      int nb1,nb2, resultat;
      nb1=lireNombreEntier();
      nb2=lireNombreEntier();
      resultat = nb1 - nb2;
      System.out.println("\n" + "Ton opération : "+ nb1 + " - " + nb2 + " = " + resultat);
   }
   
   //Multiplication
  
   static void multiplier()throws IOException {
      BufferedReader MenuSelect = new BufferedReader(new InputStreamReader(System.in));
      int nb1,nb2, resultat;
      nb1=lireNombreEntier();
      nb2=lireNombreEntier();
      resultat = nb1 * nb2;
      System.out.println("\n" + "Ton opération : " + nb1 + " * " + nb2 + " = " + resultat);
   }
  
   //Division
  
   static void deviser()throws IOException {
      BufferedReader MenuSelect = new BufferedReader(new InputStreamReader(System.in));
      double nb1,nb2, resultat;
      nb1=lireNombreEntier();
      nb2=lireNombreEntier();
      if (nb2 != 0) {
         resultat = nb1 / nb2;
         System.out.println("\n" + "Ton opération :" + nb1 + " / " + nb2 + " = " + resultat);
      }
      else {
      System.out.println ("\n" + "Le deuxième nombre n'est pas valide, une division par 0 est impossible !");
      }
   }
}
