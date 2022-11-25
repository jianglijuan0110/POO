package TP3_1;

public class ObjetPostal {
	public ObjetPostal(String origine, String destination, int codePostal, double poids, double volume,
			Recommandation recommandation) {
		super();
		this.origine = origine;
		this.destination = destination;
		this.codePostal = codePostal;
		this.poids = poids;
		this.volume = volume;
		this.recommandation = recommandation;
	}
	private String origine;
	private String destination;
	private int codePostal;
	private double poids;
	private double volume;
	private Recommandation recommandation;
	
	
	public String getOrigine() {
		return origine;
	}
	public void setOrigine(String origine) {
		this.origine = origine;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public Recommandation getRecommandation() {
		return recommandation;
	}
	public void setRecommandation(Recommandation recommandation) {
		this.recommandation = recommandation;
	}
	
	public String toString() {
		return"L'emetteur est " +this.origine+ ",le recepteur est " +this.destination+ "\n"+
				" le code postale du recepteur est " +this.codePostal+ "\n"+
				",  le poids du l'objet est " +this.poids+ "g"+"\n"+
				" le volume est " +this.volume+ "m3," +"\n"+
				 "le taux de recommandation est " +this.recommandation.convertirRecomEnInt(recommandation);
	}
}
