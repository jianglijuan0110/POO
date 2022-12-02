package TP3_1;

public class MainObjetPostal {

	public static void main(String[] args) {
		ObjetPostal o1 = new ObjetPostal("Paris", "Montpellier", "34090",3.1, 5.3,Recommandation.r1);
		ObjetPostal o2 = new ObjetPostal("Montpellier", "Paris", "75000",5.1, 6.3,Recommandation.r0);
		ObjetPostal o3 = new ObjetPostal("Lille", "Montpellier", "34090",4.1, 8.3,Recommandation.r2);
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		
		Lettre l1 = new Lettre("banquise nord","Kouk","igoo2",2,3,Recommandation.r1, Importante.ordinaire);
		Lettre l2 = new Lettre("banquise nord","Sbouk","igoo8",2,3,Recommandation.r1, Importante.urgente);
		System.out.println(l1);
		System.out.println(l2);
		
		Colis c1 = new Colis("banquise ouest","la famille Miko","igloo 2",5,4,Recommandation.r1,"vêtements",20);
		Colis c2 = new Colis("terres ouest","la famille Frodok","hangar 200",5,4,Recommandation.r2,"nourriture",15);
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
