package TP3_1;

public class MainObjetPostal {

	public static void main(String[] args) {
		ObjetPostal o1 = new ObjetPostal("Paris", "Montpellier", 34090,3.1, 5.3,Recommandation.r1);
		ObjetPostal o2 = new ObjetPostal("Montpellier", "Paris", 75000,5.1, 6.3,Recommandation.r0);
		ObjetPostal o3 = new ObjetPostal("Lille", "Montpellier", 34090,4.1, 8.3,Recommandation.r2);
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
	}

}
