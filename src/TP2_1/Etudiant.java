package TP2_1;

import java.util.Scanner;

/*********************************TP 2.1***********************************************/

public class Etudiant {

	
	/****************** Partie attributs ****************************************/
	
	//L'attribut nom de l'étudiant
	private String nom;
	
	// Vous devez insérer ci-dessous les autres attributs (l'age et les 3 notes)
	private int age;
	private double noteProg;
	private double noteSys;
	private double noteStage;
	
	/***************************************************************************/
	
	
	
	/********************Partie Constructeurs ***************************/
	
	//Constructeur par défaut qui ne contient aucun attribut
	public Etudiant(){
		//this.nom = "nominconnu";
	}
	
	
	//Constructeur qui contient seulement l'attribut nom 
	public Etudiant(String name){
		this.nom = name;
	}
	
		
	//Vous devez ci-dessous définir le constructeur qui initialise tout sauf les notes de l'étudiant
	public Etudiant(String name, int age) {
		this.nom = name;
		this.age = age;
	}
	
	//Vous devez ci-dessous définir le constructeur qui initialise tout sauf l'age de l'étudiant
	public Etudiant(String name, double noteProg, double noteSys, double noteStage) {
		this.nom = name;
		this.noteProg = noteProg;
		this.noteSys = noteSys;
		this.noteStage = noteStage;
	}
	
	//Vous devez ci-dessous définir le constructeur qui initialise tous les attributs
	public Etudiant(String name, int age, double noteProg, double noteSys, double noteStage) {
		this.nom = name;
		this.age = age;
		this.noteProg = noteProg;
		this.noteSys = noteSys;
		this.noteStage = noteStage;
	}
		
	
	/***********************************************************************/
	
	
	/*************************************Partie Accesseurs ***********************/
	
	/* Accesseurs de l'attribut nom : 
		getNom qui retourne la valeur du nom 
		setNom qui initialise la valeur du nom
	 */
	
	public String getNom() {
		return this.nom;
	}
	
	
	public void setNom(String name) {
		this.nom = name;
	}
	
	/* Vous devez ci-dessous créer les accesseurs pour les autres attributs : */
		
	//Accesseurs de l'age
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//Accesseurs des notes
	
	public double getNoteProg() {
		return this.noteProg;
	}
	
	public void setNoteProg(double noteProg) {
		if(noteProg >= 0 && noteProg <= 20) {
			this.noteProg = noteProg;
		}
		else {
			System.out.println("erreur : une note doit être entre 0 et 20");
		}
	}
	
	public double getNoteSys() {
		return this.noteSys;
	}
	
	public void setNoteSys(double noteSys) {
		if(noteSys >= 0 && noteSys <= 20 ) {
			this.noteSys = noteSys;
		}
		else {
			System.out.println("erreur : une note doit être entre 0 et 20");
		}
	}
	
	
	public double getNoteStage() {
		return noteStage;
	}
	
	public void setNoteStage(double noteStage) {
		if(noteStage >= 0 && noteStage <= 20){
			this.noteStage = noteStage;
		}
		else {
			System.out.println("erreur : une note doit être entre 0 et 20");
		}
	}
	
	
/***********************************************************************************/
	
	
	
	
	
/****************************** Partie méthodes ***************************************/	
	
	
	/* Méthode toString() qui permet d'afficher des informations concernant un étudiant. 
	Méthode à décommenter et à modifier ci-dessous */
		
	
		 public String toString() {
			return "Name : " +this.nom+ " Age : " +this.age+ " NoteProgrammation : " +this.noteProg+
					" NoteSystem : " +this.noteSys+ " NoteStage : " +this.noteStage;
		} 
	
	
	
	
	/* Méthode saisie qui permet à l'utilisateur de saisir les informations des étudiants et de les initialiser. 
	 Méthode à écrire intégralement en vous inspirant du TP1  */
		
	public void saisi(Scanner sc) {
		System.out.println("Veulliez saisir le nom de l'étudiant : " );
		this.nom =sc.next();
		System.out.println("Veuillez saisir l'âge de l'étudiant :  ");
		this.age = sc.nextInt();
		System.out.println("Veuillez saisir la note de programmation de l'étudiant : ");
		this.noteProg=sc.nextDouble();
		System.out.println("Veuillez saisir la note de système de l'étudiant : ");
		this.noteSys=sc.nextDouble();
		System.out.println("Veuillez saisir la note de stage de l'étudiant : ");
		this.noteStage=sc.nextDouble();
		
	}
	
	
	/* Méthode moyenne à décommenter et à remplir */
	
		/*
		 public double moyenne(){
		 	return 
		 }-
		 */
	
	
	/* Méthode mention à écrire ci-dessous. 
	 Cette méthode utilise la méthode moyenne définie précédemment 
	 et retourne une chaine de caractère qui correspond à la mention de l'étudiant dont les valeurs possibles sont :
	 Ajourné, passable, AB, Bien, TB */
	
	
	
	
	/* Methode ligneResultat à écrire ci-dessous 
	 * Cette méthode utilise le résultat de moyenne et de mention
	 * et retourne une chaine de caractère précisant :
	 * le nom, la moyenne, la mention, et si l'étudiant est ajourné, la liste des modules obtenus
	 */
	
	

}
