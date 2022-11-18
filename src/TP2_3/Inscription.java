package TP2_3;

public class Inscription {
	
	/**************** Attributs **********************/
	private int codeInscription;
	private int codePays;
	
	
	/***************Constructeurs ********************/
	public Inscription() {
		
	}
	
	
	public Inscription(int codeI, int codeP) {
		this.setCodeInscription(codeI);;
		this.setCodePays(codeP);
	}
	
	
	/******************Accesseurs *********************/
	public int getCodeInscription() {
		return codeInscription;
	}
	public void setCodeInscription(int codeI) {
		if (codeI == 1 || codeI==2 ) this.codeInscription = codeI;
		else {
			System.out.println("Erreur ! Le code d'inscription doit être 1 ou 2");
		}
	}
	public int getCodePays() {
		return codePays;
	}
	public void setCodePays(int codeP) {
		if (codeP == 1 || codeP==2 || codeP==3) this.codePays = codeP;
		else {
			System.out.println("Erreur ! Le code pays doit être 1, 2 ou 3");
		}

	}
	
	/************Methode ToString ******************/
	 public String toString() {
			return "Inscription: " + this.typeInscription() + ", nationalite: " + this.nationalite();
		} 
	
	 /***********Autres méthodes*******************/
	 
	 /* Méthode nationalité qui retourne la nationalité de l'étudiant */
		public String nationalite()
		{
			if (this.getCodePays() ==1) return "étudiant français";
			else if (this.getCodePays() == 2) return "étudiant étranger non francophone";
			else if (this.getCodePays()==3) return "étudiant étranger francophone"; 
			else return "pas de nationalité renseignée";
		}
		
		/* Méthode nationalité qui retourne la nationalité de l'étudiant */
		public String typeInscription()
		{
			if (this.getCodeInscription() ==1) return "première inscription";
			else if (this.getCodeInscription()==2) return "réinscription"; 
			else return "pas d'information sur le nombre d'inscription";
		}
		

}
