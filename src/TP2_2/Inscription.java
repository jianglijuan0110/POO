package TP2_2;

import java.util.Scanner;

public class Inscription {

	//L'attribut codeInscription de l'étudiant
	private int codeInscription;
	
	//L'attribut codeInscription de l'étudiant
	private int codePays;
	
	/** constucteur*/
	public Inscription() {
		
	}
	
	
	public Inscription(int codeInscription, int codePays) {
		this.codeInscription = codeInscription;
		this.codePays = codePays;
	}




	/* Accesseurs de l'attribut codeInscription : 
	getCodeInscription qui retourne la valeur du codeInscription 
	setCodeInscription qui initialise la valeur du codeInscription
 */
	public int getCodeInscription() {
		return this.codeInscription;
	}
	
	public void setCodeInscription(int codeInscription ) {
		this.codeInscription = codeInscription;
	}
	
	/* Accesseurs de codePayes*/
	public int getCodePays() {
		return this.codePays;
	}
	
	public void setCodePays(int codePays) {
		this.codePays = codePays;
	}
	
	
	/*Méthode nationalite qui permet d'afficher de la nationaliré de l'étudiant*/
	public String nationalite() {
		if(this.codePays == 1) {
			return ("L'étudiant est français");
		}
		if(this.codePays == 2) {
			return ("L'étudiant est étranger francophon");
		}
		if(this.codePays == 3) {
			return ("L'étudiant est étranger non francophon");
		}
		return "inconnu";
	}
	
	public String typeInscription() {
		if(this.codeInscription == 1) {
			return "c’est une première inscription";
		}
		if(this.codeInscription == 2) {
			return ("c’est une une réinscription");
		}
		return "inconnu";
	}
	
	/* Méthode toString() qui permet d'afficher des informations concernant un étudiant.*/
	public String toString() {
		return this.nationalite() +" "+this.typeInscription();
	}
	public void saisie(Scanner scan) throws java.io.IOException{
		
	}
}
