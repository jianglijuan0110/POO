package TP1;

import java.util.Scanner;

public class MainTP1 {


	/********************** Partie méthodes *************************/

		/* méthode réalisant une conversion degrés Celsius vers degrés Farenheit
		 Entrée : un nombre réel tempC passé en paramètre
		 tempC représente une temperature exprimée en degrés Celsius
		 Résultat : un nombre réel résultat de la conversion en degrés Farenheit
		 Méthode : calcul de tempC * 1,8 + 32.  */
	
		public static double celsius2Farenheit(double tempC) {
			return tempC * 1.8 + 32;	
		}
	
	
	
	
			

	/* Ci-dessous écrivez le code des autres méthodes dont la signature vous est donnée */
	
	
		public static double moyenne(double n1, double n2, double n3) {
			return (n1+n2+n3)/3.0;
		}
	
	
	
		public static double moyennePonderee(double n1, double n2, double n3, double c1, double c2, double c3) {
			return (n1*c1+n2*c2+n3*c3)/(c1+c2+c3);
			
		}
	
	
	
		public static String  conjugaisonFutur(String inf) {
			return ("La conjugaisonFutur de " + inf +" est : \n")+
										("je "+inf+"ai\n"+
										"tu "+inf+"as\n"+
										"elle/il "+inf+"a\n"+
										"nous "+inf+"ons\n"+
										"vous "+inf+"ez\n"+
										"elles/ils "+inf+"ont");
		}
	
	
	
	
		
	
	/************************Partie Main ************************/
	
	/* Cette méthode main est la méthode principale
	Le programme commence à s'exécuter à partir de là
	et appelle des sous-programmes */
	
	
	public static void main(String[] args) {

		/* Test de la conversion Celsius vers Farenheit */
		 
		 	System.out.println("**** Test de la conversion Celsius vers Farenheit ****");
		 
		 	// Cas 1 : valeur de température ordinaire en été à Montpellier
		 
		 	System.out.println("En été à Montpellier : 35 degrés celsius valent "+
				 celsius2Farenheit(35)+" en degrés Farenheit");
		
		 	// Cas 2 : sur le même modèle, donner le code permettant de calculer la température d'ébullition de l'eau
		 
			 
		 	System.out.println("La température d'ébullition de l'eau : 100 degrés celsius valent "+
					 celsius2Farenheit(100)+" en degrés Farenheit");
		
					 	
		 
		 /* Ci-dessous vous appelerez la méthode moyenne avec les valeurs suivantes :*/
		 	 

		 	 System.out.println("**** Test de la moyenne ****");
		 	 
		 	 // cas 1 : moyenne de 10, 5, 15

		 	System.out.println("la moyenne de 10, 5, 15 est "+ moyenne(10, 5, 15));
			

		 	// cas 2 : moyenne de 12, 14, 16
		 	
		 	System.out.println("la moyenne de 12, 14, 16 est "+ moyenne(12, 14, 16));
			


		 	 // cas 3 : moyenne de 7, 12, 8

		 	System.out.println("la moyenne de 7, 12, 8 est "+ moyenne(7, 12, 8));
	 	 
		 	 
 
		 /* Ci-dessous vous appelerez la méthode moyennePonderee avec les valeurs suivantes :*/
		 	
		 	 System.out.println("**** Test de la moyenne ponderee ****");
		 	 
		 	 
		 	 // cas 1 : moyenne de 10, 5, 15 avec 20, 20, 60

		 	 System.out.println("la moyenne de les notes 10, 5, 15 avec les coefficients 20, 20, 60 est " + moyennePonderee(10,5,15,20,20,60));
			 	

		 	 // cas 2 : moyenne de 12, 14, 16 avec 20, 20, 60



		 	 // cas 3 : moyenne de 12, 14, 16 avec 30, 30, 20



		 	 // cas 4 : moyenne de 7, 12, 8 avec 20, 20, 60
			

		 	 
 

		 	
	 
		 
		 	
		/* Ci-dessous vous appelerez la méthode conjugueFuturPremierGroupe avec les valeurs suivantes :*/
		 	System.out.println("**** Test de conjugaisonFutur ****");
			
			// Cas 1 : chanter
			
		 	System.out.println(conjugaisonFutur("chanter"));

		 	
			// Cas 2 : travailler
			

		 	
		
	
	
	
	/************************ Utilisation du scanner pour entrer les valeurs ************************/ 
	 
	 
	/* On crée un Scanner pour tout le programme. Il représente le flux de ce qui est saisi au clavier 
	Instruction à décommenter pour pouvoir l'utiliser */
	
	 Scanner sc = new Scanner(System.in);
		 	
	System.out.println("***test de la complétion sémantique à faire ci-dessous");
		 System.out.println("entrez un entier :");	
		 int i = sc.nextInt();
		 System.out.println("entier lu : " +i+"\n");
		 	
 
	System.out.println("***Test des précédentes méthodes en demandant à l'utilisateur de saisir une valeur au clavier */ ");
	 
	 System.out.println(" Celsius2Farenheit (Instructions ci-dessous à décommenter pour exemple");
	 System.out.println("Veuillez entrer un nombre réel représentant une température en degrés Celsius :");
	 
	 double tempCelsius = sc.nextDouble();
	 
	 System.out.println(tempCelsius+" degrés celsius valent "+ celsius2Farenheit(tempCelsius)+" en degrés Farenheit");

	 
	 
	 // Moyenne (Ecrire le code source ci-dessous en vous inspirant de ce qui a été fait pour la conversion de Celsius a Farenheit)
		System.out.println("***test de la méthode moyenne");
		System.out.println("entrez un entier :");
		int n1 = sc.nextInt();
		System.out.println("entrez un entier :");
		int n2 = sc.nextInt();
		System.out.println("entrez un entier :");
		int n3 = sc.nextInt();
		System.out.println("la moyenne de " +n1+ "," +n2+ "," +n3+ " est " + moyenne(n1,n2,n3)  );
		
		
	// Moyenne pondérée (Ecrire le code source ci-dessous en vous inspirant de ce qui a été fait pour la conversion de Celsius a Farenheit)
		System.out.println("***test de la méthode moyennePonderee");
		System.out.println("entrez un entier :");
		int nb1 = sc.nextInt();
		System.out.println("entrez un entier :");
		int nb2 = sc.nextInt();
		System.out.println("entrez un entier :");
		int nb3 = sc.nextInt();
		System.out.println("entrez un entier :");
		int c1 = sc.nextInt();
		System.out.println("entrez un entier :");
		int c2 = sc.nextInt();
		System.out.println("entrez un entier :");
		int c3 = sc.nextInt();
		System.out.println("la moyenne des notes moyenne " +nb1+ "," +nb2+ "," +nb3+ "," + c1+ "," +c2+ "," +c3+" est " + moyennePonderee(10,5,15,20,20,60)  );
	
	// Conjugaison (Ecrire le code source ci-dessous en vous inspirant de ce qui a été fait pour la conversion de Celsius a Farenheit)
		System.out.println("***test de la méthode conjugaisonFutur ");
		System.out.println("entrez une chaine ? ");
		String s = sc.next();
		System.out.println("chaine lue : "+s+"\n");
		System.out.println(conjugaisonFutur(s));
		
	
		sc.close();
	}
	
	
}	
	
