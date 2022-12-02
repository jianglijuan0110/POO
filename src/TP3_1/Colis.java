package TP3_1;

public class Colis extends ObjetPostal{
	private String contenu;
	private double valeur;
	public String getContenu() {
		return contenu;
	}
	public Colis(String origine, String destination, String codePostal, double poids, double volume,
			Recommandation recommandation,String contenu,double valeur) {
		super(origine, destination, codePostal, poids, volume, recommandation);
		this.setContenu(contenu);
		this.setValeur(valeur);
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public double getValeur() {
		return valeur;
	}
	public void setValeur(double valeur) {
		this.valeur = valeur;
	}
	public String toString() {
		return super.toString()+" "+this.contenu+ "  la valeur est " +this.valeur+ "euros";
	}
	
}
