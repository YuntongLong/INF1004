package Devoir1;

public class Companie {
	public static void main(String[]args) {
		TrajetList<String> JohS17T= new TrajetList();
		  Chauffeur JohS17= new Chauffeur ("John","Smith",2017,"123 Main Line, Toronto",JohS17T);
		  JohS17T.insert("Toronto","Ottawa",6788,7140,"Aston Martin Rapide S");
		  JohS17T.insert("Ottawa","Montreal",7140,7332,"Aston Martin Rapide S");
		  JohS17T.insert("Montreal","Quebec City",7332,7600,"Aston Martin Rapide S");
		  JohS17T.insert("Quebec City","Ottawa",7600,8047,"Aston Martin Rapide S");
		  JohS17T.insert("Ottawa","Toronto",8047,8497,"Aston Martin Rapide S");
		  
		  TrajetList<String> SarB18T= new TrajetList();
		  Chauffeur SarB18= new Chauffeur ("Sarah","Barnes",2018,"123 Off Line, Quebec City",SarB18T);
		  SarB18T.insert("Quebec City","Montreal",4575,4844,"Rolls-Royce Cullinan");
		  SarB18T.insert("Montreal","Trois-Rivieres",4844,4985,"Rolls-Royce Cullinan");
		  SarB18T.insert("Trois-Rivieres","Quebec City",4985,5114,"Rolls-Royce Cullinan");
		  SarB18T.insert("Montreal","Quebec City",6540,6809,"Rolls-Royce White Ghost");
		  SarB18T.insert("Quebec City","Trois-Rivieres",6809,6938,"Rolls-Royce White Ghost");
		  SarB18T.insert("Trois-Rivieres","Montreal",6938,7070,"Rolls-Royce White Ghost");
		  
		  TrajetList<String> MarR18T= new TrajetList();
		  Chauffeur MarR18= new Chauffeur ("Mark","Riley",2017,"673 Off Line, Quebec City",MarR18T);
		  MarR18T.insert("Quebec City","Montreal",4575,4844,"Rolls-Royce Cullinan");
		  MarR18T.insert("Montreal","Trois-Rivieres",4844,4985,"Rolls-Royce Cullinan");
		  MarR18T.insert("Trois-Rivieres","Quebec City",4985,5114,"Rolls-Royce Cullinan");
		  MarR18T.insert("Quebec City","Montreal",6540,6809,"Rolls-Royce White Ghost");
		  MarR18T.insert("Montreal","Trois-Rivieres",6809,6941,"Rolls-Royce White Ghost");
		  MarR18T.insert("Trois-Rivieres","Quebec City",6941,7070,"Rolls-Royce White Ghost");
		  
		  
		Limousine L1= new Limousine("Rolls-Royce Cullinan","589 TDW", 100, 5, "Noir");
		Limousine L2= new Limousine("Rolls-Royce White Ghost", "AM0 823", 82, 4, "Blanch");
		Limousine L3= new Limousine("Aston Martin Rapide", "AN2 496", 90, 4, "Gris");
		//AN2 496
		JohS17.display(JohS17);
		MarR18.display(MarR18);
		System.out.println(L1);
		
}}
