package TP2_1;

import java.io.IOException;
import java.util.Scanner;

public class MainEtudiant {

	public static void main(String[] args) throws IOException {
		
		 
		 /***********************Constructeurs *******************************************/
		
			//Création d'un nouvel étudiant dont le nom est paul  
			Etudiant etud1 = new Etudiant("Paul");
		
			//En vous inspirant de l'exemple, écrire ci-dessous le code pour créer les autres étudiants  
			Etudiant etud2 = new Etudiant("Jean", 24);
			Etudiant etud3 = new Etudiant("Abdoulkhader", 23);
			Etudiant etud4 = new Etudiant("Astrid", 26);
			Etudiant etud5 = new Etudiant("Paolo", 27);
			Etudiant etud6 = new Etudiant("Zoé", 26, 12, 14, 17);
		
		
		/***********************************Accesseurs*****************************************/
		
		/* Affichage des informations grâce à l'accesseur get */
		
			//Affichage du nom de etud1
			System.out.println("Le nom de l'étudiant1 est: " +etud1.getNom());
			
			
			//Ecrire ci-dessous les informations des autres étudiants (toutes les informations connues par étudiant)
			
			System.out.println("Le nom de l'étudiant est : " +etud2.getNom());
			System.out.println("Le nom de l'étudiant est : " +etud3.getNom());
			System.out.println("Le nom de l'étudiant est : " +etud4.getNom());
			System.out.println("Le nom de l'étudiant est : " +etud5.getNom());
			System.out.println("Le nom de l'étudiant est : " +etud6.getNom());
			
		
		
		/* Modification d'information grâce à l'accesseur set */
		
			// Modification du nom de etud1 
			etud1.setNom("Paul-Henri");
			
			
			// Ecrire ci-dessous le code pour modifier l'âge de Jean
			
			etud2.setAge(26);
			
			//Ecrire ci-dessous le code pour modifier la note de programmation de Zoe
	
			etud6.setNoteProg(15);
			
			System.out.println("Note de programmation de Zoé est : " +etud6.getNoteProg());
			
			// Ecrire ci-dessous le code pour ajouter les notes des autres étudiants
			etud1.setNoteProg(16);
			etud1.setNoteSys(15);
			etud1.setNoteStage(14);
			
			etud2.setNoteProg(8);
			etud2.setNoteSys(7);
			etud2.setNoteStage(11);
			
			etud3.setNoteProg(10);
			etud3.setNoteSys(14);
			etud3.setNoteStage(11);
			
			etud4.setNoteProg(12);
			etud4.setNoteSys(5);
			etud4.setNoteStage(18);
			
			etud5.setNoteProg(2);
			etud5.setNoteSys(10);
			etud5.setNoteStage(11);
			
		
			
			
			

		/* Verification que les modifications ont bien été prises en compte */
		
			//Pour chaque étudiant modifié, écrire ci-dessous le code permettant d'afficher les nouvelles informations, grâce à l'accesseur get
		
		
			
		
		
		/*************************** Les méthodes ************************************/
		
		
		/* Utilisation de la méthode toString  */
			
			//Utilisation de la méthode toString pour afficher l'étudiant etud1
		
			System.out.println("Informations concernant l'étudiant 1: " + etud1.toString());
			
		
			//Faire la même chose pour tous les étudiants et vérifier que les données sont correctes
			
			System.out.println("Informations concernant l'étudiant 1: " + etud2.toString());
			System.out.println("Informations concernant l'étudiant 1: " + etud3.toString());
			System.out.println("Informations concernant l'étudiant 1: " + etud4.toString());
			System.out.println("Informations concernant l'étudiant 1: " + etud5.toString());
			System.out.println("Informations concernant l'étudiant 1: " + etud6.toString());
		
		/* Utilisation de la méthode saisie */
		
			// Créer un nouvel étudiant etud7 grace au constructeur vide
			Etudiant etud7 = new Etudiant();
	
			// Ouvrir le scanner
			Scanner sc = new Scanner(System.in);
			
			//Utiliser la méthode saisie définie dans la classe Etudiant sur l'étudiant etud7 (vous choisissez les valeurs)
			etud7.saisi(sc);
		
			//Vérifier grâce à la méthode toString que les informations concernant etud7 ont bien été initialisées
			System.out.println( etud7.toString());
		
			
			
		
		/* Utilisation de la méthode moyenne */
			
			// Calcul et affichage de la moyenne de Paul-Henri. A décommenter pour exemple
			
				//System.out.println("la moyenne de Paul-Henri est: " + etud1.moyenne());
			
			
			//Ecrire ci dessous le code pour calculer et afficher la moyenne des autres étudiants
			
			
			
			
			
		/* Utilisation de la méthode mention pour chaque étudiant. Code à écrire ci-dessous */	
			
			
		
		
		/* Utilisation de la méthode ligneResultat pour chaque étudiant. Code à écrire ci-dessous */
			
			
		

	}

}
