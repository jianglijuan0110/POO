package TP3_1;

public enum Recommandation {r0,r1,r2;
	public int convertirRecomEnInt(Recommandation r) {
		if(r == Recommandation.r0) 	
			return 0;
		if(r == Recommandation.r1) 	
			return 1;
		if(r == Recommandation.r2) 	
			return 2;
		return -1;

	}
}
