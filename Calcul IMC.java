class Patient {
	double poids;
	double hauteur;
	double imc = 0.0;
	
	// méthode pour entrer les données patient poids et taille
	public void init(double poidsin, double hauteurin) {
		poids=0.0;
		hauteur=0.0;
		if (poidsin >0 && hauteurin >0) {
			poids = poidsin;
			hauteur = hauteurin;}
	}

	// méthode pour afficher les données du patient
	public void afficher() {
		System.out.print("Patient : ");
		System.out.printf("%.1f", poids);
		System.out.print(" kg pour ");
		System.out.printf("%.1f", hauteur);
		System.out.println(" m");
	}
	
	public double imc() {
		 imc = 0.0;
		if (hauteur !=0) {
			imc = poids/(hauteur*hauteur);}
		return imc;
	}
}

class Imc {
    public static void main(String[] args) {

        Patient quidam = new Patient();
        quidam.init(74.5, 1.75);
        quidam.afficher();
        System.out.println("Votre IMC est de : " + quidam.imc());
        quidam.init( -2.0, 4.5);
        quidam.afficher();
    }
}
