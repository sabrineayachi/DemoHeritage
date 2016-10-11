package heritage;

public class Professeur extends Personne {
	private int salaire;
	public static String nom = "Ali";
	
	public Professeur(){
	};
	
	private  void afficherMethode(){
		//affichage des attributs de la classe mère
		System.out.println("je suis " + super.nom + prenom + "et mon age = " + age );
		
		//afficher la méthode de la classe mère
		veillir();
		}
	
	public static void main(String[] args) {
		Professeur p1 = new Professeur();
		
	
		//afficherMethode(); //contexte static
		p1.afficherMethode(); // contexte non static
		
	}
}
