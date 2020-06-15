package Devoir1;

public class Chauffeur {  
	private static final char[] Chauffeur = null;
	private String nom,prenom,adr;
	private int ann;
	private TrajetList Tra;
	
	public Chauffeur(String nom, String prenom, int ann, String adr, TrajetList Tra) {
	this.nom= nom;
	this.prenom= prenom;
	this.ann= ann;
	this.adr= adr;
	this.Tra= Tra;
}
	
	public TrajetList getTra() {
		return Tra;
	}
	public String toString() {
	    return nom+ " "+ prenom + "   "+ ann+ " employé"+ "   "+ adr;
	}
	
	public void display(Chauffeur chau) throws WrongInputException {
		System.out.println(chau);
		System.out.println("\nles trajets:\n");
		getTra().display();
	}
 
	
}
