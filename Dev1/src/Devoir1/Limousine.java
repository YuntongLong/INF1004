package Devoir1;

public class Limousine {
	private String num, couleur, type;
	private int capacite, nbP;
	
	public Limousine(String type, String num, int capacite, int nbP, String couleur) {
		this.type= type;
		this.num= num;
		this.capacite= capacite;
		this.nbP= nbP;
		this.couleur= couleur;
	}
	
	public String toString() {
		return type+ "  "+couleur+"  " + num+ "\nla capacit¨¦ du r¨¦servoir:"+ capacite+"ltr" + "\nle nombre de passagers:"+nbP; 
	}

}
