package Devoir1;
import java.util.Scanner;

import org.hamcrest.core.Is;

import java.util.Arrays;
public class Companie {

	public static void main(String[]args) throws WrongInputException {
		Scanner scanner = new Scanner(System.in);
		int chauf1 = 0;
		int chauf2 = 0;
		int route = 0;
		int inf1 = 0;
		int lim1 = 0;
		int lim2 = 0;
		String TempR = null;
		
		
		
		  TrajetList<String> JohS17T= new TrajetList();
		  Chauffeur JohS17= new Chauffeur ("John","Smith",2017,"123 Main Line, Toronto",JohS17T);
		  JohS17T.insert("Toronto","Ottawa",6788,7140,"Aston Martin Rapide S");
		  JohS17T.insert("Ottawa","Montreal",7140,7332,"Aston Martin Rapide S");
		  JohS17T.insert("Montreal","Quebec City",7332,7600,"Aston Martin Rapide S");
		  JohS17T.insert("Quebec City","Ottawa",7600,8047,"Aston Martin Rapide S");
		  JohS17T.insert("Ottawa","Toronto",8047,8497,"Aston Martin Rapide S");
		  
		  TrajetList<String> LarS19T= new TrajetList();
		  Chauffeur LarS19= new Chauffeur ("Larry","Smith",2019,"123 Main Line, Toronto",LarS19T);
		  LarS19T.insert("Toronto","Ottawa",4788,5140,"Aston Martin Vantage");
		  LarS19T.insert("Ottawa","Montreal",5140,6332,"Aston Martin Vantage");
		  LarS19T.insert("Montreal","Quebec City",6332,6600,"Aston Martin Vantage");
		  LarS19T.insert("Quebec City","Ottawa",6600,7047,"Aston Martin Vantage");
		  LarS19T.insert("Ottawa","Toronto",7047,7497,"Aston Martin Vantage");
		  
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
		  
		  Chauffeur TempC= new Chauffeur (null,null,0,null,null);
		  
		  
		  
		Limousine L1= new Limousine("Rolls-Royce Cullinan","589 TDW", 100, 5, "Noir");
		Limousine L2= new Limousine("Rolls-Royce White Ghost", "AM0 823", 82, 4, "Blanch");
		Limousine L3= new Limousine("Aston Martin Vantage", "PEP 138", 80, 4, "Rouge");
		Limousine L4= new Limousine("Aston Martin Rapide", "AN2 496", 90, 4, "Gris");
		Limousine TempL= new Limousine(null,null,0,0,null);

			
		
		
		try {	
		System.out.println("1.Toronto-Ottatwa 2.Quebec-Montreal");
		System.out.println("Veuillez sélectionner l'itinéraire que vous souhaitez choisir.");
		route = scanner.nextInt();
	
			if(route != 1&& route != 2) {
		}
			do{	
				System.out.println("veuillez entrer à nouveau：1.Toronto-Ottatwa 2.Quebec-Montreal");
				route = scanner.nextInt();	}
			while(route!=1 && route!=2);

		//Toronto-Ottatwa
		if(route == 1) {
			TempR = "Toronto-->Ottatwa";
			//Choisissez une limousine
			System.out.println("Quelle Limousine voulez-vous choisir?");
			System.out.println("1.Aston Martin Rapide S  2.Aston Martin Vantage");
		    lim1 = scanner.nextInt();
		    if (lim1!=1&&lim1!=2) {
				do{	
				System.out.println("veuillez entrer à nouveau：1.Aston Martin Rapide S  2.Aston Martin Vantage");
				lim1 = scanner.nextInt();	}
			while(lim1!=1 && lim1!=2);}
		    if (lim1 == 1) {
		    	System.out.println("Réservé pour vous： " + L4);
		    	TempL = L4;
		    }
		    else if(lim1 == 2) {
		    	System.out.println("Réservé pour vous： " + L3);
		    	TempL = L3;
		    }
			//Choisissez un chauffeur
			System.out.println("Veuillez sélectionner le chauffeur que vous souhaitez choisir.");
			System.out.println("1.John Smith 2.Larry Smith");
			chauf1 = scanner.nextInt();
			if (chauf1!=1&&chauf1!=2) {
				do{	
				System.out.println("veuillez entrer à nouveau：1.John Smith 2.Larry Smith");
				chauf1 = scanner.nextInt();	}
			while(chauf1!=1 && chauf1!=2);}
				if(chauf1 == 1) {
				System.out.println(JohS17);
				TempC = JohS17;
				
				System.out.println("Indique s'il faut vérifier les informations détaillées du chauffeur?");
				System.out.println("1.oui 2.non");
				inf1 = scanner.nextInt();
				if(inf1!=1&&inf1!=2) {
					do {
						System.out.println("veuillez entrer à nouveau：1.oui 2.non");
						inf1 = scanner.nextInt();}
					while(inf1!=1 && inf1!=2);}
					
						if(inf1 == 1) {
					}
							JohS17.display(JohS17);
							System.out.println("Votre réservation est terminée");
					}
						else if(inf1 == 2) {
							System.out.println("Votre réservation est terminée");
				}
				}
			else if(chauf1 == 2) {
				System.out.println(LarS19);
				TempC = LarS19;
				System.out.println("Indique s'il faut vérifier les informations détaillées du chauffeur?");
				System.out.println("1.oui 2.non");
				inf1 = scanner.nextInt();
				if(inf1!=1&&inf1!=2) {
					do {
						System.out.println("veuillez entrer à nouveau：1.oui 2.non");
						inf1 = scanner.nextInt();}
					while(inf1!=1 && inf1!=2);}
						if(inf1 == 1) {
							LarS19.display(LarS19);
							System.out.println("Votre réservation est terminée");
					}
						else if(inf1 == 2) {
							System.out.println("Votre réservation est terminée");
				}
			}
		//Quebec City-Montreal		
		else if(route == 2) {
			TempR = "Quebec-->Montreal";
			//Choisissez une limousine
			System.out.println("Quelle Limousine voulez-vous choisir?");
			System.out.println("1.Rolls-Royce Cullinan  2.Rolls-Royce White Ghost");
		    lim2 = scanner.nextInt();
		    if (lim2!=1&&lim2!=2) {
				do{	
				System.out.println("veuillez entrer à nouveau： 1.Rolls-Royce Cullinan  2.Rolls-Royce White Ghost");
				lim2 = scanner.nextInt();	}
			while(lim2!=1 && lim2!=2);}
		    if (lim2 == 1) {
		    	System.out.println("Réservé pour vous： " + L1);
		    	TempL = L1;
		    }
		    else if(lim2 == 2) {
		    	System.out.println("Réservé pour vous： " + L2);
		    	TempL = L2;
		    }
		    //Choisissez un chauffeur
			System.out.println("Veuillez sélectionner le pilote que vous souhaitez choisir.");
			System.out.println("1.Sarah Barnes 2.Mark Riley");
			chauf2 = scanner.nextInt();
			if (chauf2!=1&&chauf2!=2) {
				do{	
				System.out.println("veuillez entrer à nouveau：1.Sarah Barnes 2.Mark Riley");
				chauf2 = scanner.nextInt();	}
			while(chauf2!=1 && chauf2!=2);}
			    if(chauf2 == 1) {
				System.out.println(SarB18);
				TempC = SarB18;
				System.out.println("Indique s'il faut vérifier les informations détaillées du chauffeur?");
				System.out.println("1.oui 2.non");
				inf1 = scanner.nextInt();
				if(inf1!=1&&inf1!=2) {
					do {
						System.out.println("veuillez entrer à nouveau：1.oui 2.non");
						inf1 = scanner.nextInt();}
					while(inf1!=1 && inf1!=2);}
					if(inf1 == 1) {
					        SarB18.display(SarB18);
					System.out.println("Votre réservation est terminée");}
				else if(inf1 == 2 ) {
					System.out.println("Votre réservation est terminée");}
			    }
					
					if(chauf2 == 2) {
						System.out.println(MarR18);
						TempC = MarR18;
						System.out.println("Indique s'il faut vérifier les informations détaillées du chauffeur?");
						System.out.println("1.oui 2.non");
						inf1 = scanner.nextInt();
						if(inf1!=1&&inf1!=2) {
							do {
								System.out.println("veuillez entrer à nouveau：1.oui 2.non");
								inf1 = scanner.nextInt();}
							while(inf1!=1 && inf1!=2);}
							if(inf1 == 1) {
							        SarB18.display(SarB18);
							System.out.println("Votre réservation est terminée");}
							else if (inf1 == 2 ) {
							System.out.println("Votre réservation est terminée");
				}
			
		}
		}
		
		
				
        //Montrer les résultats
	}
	catch(WrongInputException e) {
		System.out.println("empty");
	}finally {
		System.out.println("Voici le teajet réservé pour vous:"+"\n"+TempR+"\n"+TempC+TempL+"\nEntrez 1 pour afficher les détails du chauffeur.");
		TempC.display(TempC);
		System.out.println("Merci pour votre utilisation.");
		
	}}}
