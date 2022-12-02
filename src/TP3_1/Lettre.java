package TP3_1;

public class Lettre extends ObjetPostal {
	private Importante urgence;
	
	public Lettre(String origine, String destination, String codePostal, double poids, double volume,
			Recommandation recommandation, Importante u ) {
		super(origine, destination, codePostal,poids, volume, recommandation);
		this.setUrgence(u);
	}

	public Importante getUrgence() {
		return urgence;
	}

	public void setUrgence(Importante urgence) {
		this.urgence = urgence;
	}
	
	public String toString() {
		return super.toString()+" "+this.urgence;
	}
}
