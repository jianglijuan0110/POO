package TP2_2;

import java.util.Scanner;


/*********************************TP 2.1***********************************************/

public class Etudiant {

	
	/****************** Partie attributs ****************************************/
	
	//L'attribut nom de l'étudiant
	private String nom;
	//L'attribut inscription de l'étudiant
	private Inscription inscription;
	// Vous devez insérer ci-dessous les autres attributs (l'age et les 3 notes)
	
	private double noteProg, noteSyst, noteStage;
	private int age;
	
	/***************************************************************************/
	
	
	
	/********************Partie Constructeurs ***************************/
	
	//Constructeur par défaut qui ne contient aucun attribut
	public Etudiant(){
	}
	
	
	//Constructeur qui contient seulement l'attribut nom 
	public Etudiant(String name){
		this.nom = name;
	}
	
		
	//Vous devez ci-dessous définir le constructeur qui initialise tout sauf les notes de l'étudiant
	public Etudiant(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
	
	//Vous devez ci-dessous définir le constructeur qui initialise tout sauf l'age de l'étudiant
	public Etudiant(String nom, double noteProg, double noteSyst,
			double noteStage) {
		this.nom = nom;
		this.noteProg = noteProg;
		this.noteSyst = noteSyst;
		this.noteStage = noteStage;
	}
	
	//Vous devez ci-dessous définir le constructeur qui initialise tous les attributs
	
	public Etudiant(String nom, int age, double noteProg, double noteSyst,
			double noteStage) {
		this.nom = nom;
		this.age = age;
		this.setNoteProg(noteProg);
		this.setNoteSyst(noteSyst);
		this.setNoteStage(noteStage);
	
	}
	
	// constructeur
	public Etudiant(String nom, int age, int codeInscription, int codePays) {
		this.nom = nom; 
		this.age = age;
		this.inscription = new Inscription(codeInscription, codePays);
	
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
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	//Accesseurs des notes
	public double getNoteProg() {
		return noteProg;
	}
	public void setNoteProg(double noteProg) {
		if(noteProg >= 0 && noteProg <= 20) {
			this.noteProg = noteProg;
		}
		else {
			System.out.println("erreur : une note doit être entre 0 et 20");
		}
	}
	public double getNoteSyst() {
		return noteSyst;
	}
	public void setNoteSyst(double noteSyst) {
		if(noteSyst >= 0 && noteSyst <= 20 ) {
			this.noteSyst = noteSyst;
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
	
	//Accesseurs de l'inscription
	public Inscription getInscription() {
		return this.inscription;
	}
	
	public void setIscription(Inscription inscription) {
		this.inscription = inscription;
	}
	
/***********************************************************************************/
	
	
	
	
	
/****************************** Partie méthodes ***************************************/	
	
	
	/* Méthode toString() qui permet d'afficher des informations concernant un étudiant. 
	Méthode à décommenter et à modifier ci-dessous */
		
	
		 public String toString() {
			 String res = "Etudiant [nom=" + nom + ", noteProg=" + noteProg
					+ ", noteSyst=" + noteSyst + ", noteStage=" + noteStage
					+ ", age=" + age + "]";
			 if(this.inscription != null) {
				 res = res + this.inscription.toString();
			 }
			 return res;
		} 
	
	
	
	
	/* Méthode saisie qui permet à l'utilisateur de saisir les informations des étudiants et de les initialiser. 
	 Méthode écrire intégralement en vous inspirant du TP1  */
		
	public void saisie(Scanner scan) throws java.io.IOException{
		System.out.println("Entrez le nom de l'étudiant");
		this.setNom(scan.next());
		System.out.println("Entrez l'âge de l'étudiant");
		this.setAge(scan.nextInt());
		System.out.println("Entrez la note de programmation");
		this.setNoteProg(scan.nextInt());
		System.out.println("Entrez la note de systeme");
		this.setNoteSyst(scan.nextInt());
		
		System.out.println("Entrez la note de stage");
		this.setNoteStage(scan.nextInt());
	}
	
	
	/* Méthode moyenne à décommenter et à remplir */
	
		
		 public double moyenne(){
		 	return (this.noteProg + this.noteSyst + this.noteStage)/3 ;
		 }
		 
	
	
	/* Méthode mention à écrire ci-dessous. 
	 Cette méthode utilise la méthode moyenne définie précédemment 
	 et retourne une chaine de caractère qui correspond à la mention de l'étudiant dont les valeurs possibles sont :
	 Ajourné, passable, AB, Bien, TB */
	
			public String mention()
			{
				double moy = moyenne();
				if (moy < 10) return "ajourné";
				else if (moy <12 ) return "passable";
				else if (moy < 14) return "assez bien";
				else if (moy < 16) return "bien";
				else return "très bien";
			}
	
	
	/* Methode ligneResultat à écrire ci-dessous 
	 * Cette méthode utilise le résultat de moyenne et de mention
	 * et retourne une chaine de caractère précisant :
	 * le nom, la moyenne, la mention, et si l'étudiant est ajourné, la liste des modules obtenus
	 */
	
			public String ligneResultat(){
				String p="",s="",st="";
				if(this.moyenne()<10 && ( (this.noteProg >=10)||(this.noteSyst >=10)||(this.noteStage >=10)) ) {
					 if (this.noteProg >=10) p="Programmation, "; 
					 if (this.noteSyst >=10) s="Systeme, ";
					 if (this.noteStage >=10) st= "Stage, ";
					
					return(this.nom + " est " + this.mention() + " il a quand meme obtenu les modules "+p + s + st);
				
				}
				else if ((this.noteProg <10) && (this.noteSyst <10) && (this.noteStage <10) ) return(this.nom + " est " + this.mention() + " il n'a obtenu aucun module");
				else return(this.nom + " a pour moyenne " + this.moyenne() + " et pour mention " + this.mention());
			}

}
