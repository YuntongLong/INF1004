package Devoir1;

import java.util.Iterator;

public class TrajetList<T>// implements Iterable<T> 
{
	
	
	private Trajet head;
	private int N;
	public TrajetList() {
		
		this.head= new Trajet(null,null,0,0,null,null);
		this.N= 0;
	}
		
	public class Trajet{
		private String villeD,villeA;
		private int kilometrageD,kilometrageA;
		private String limousine;
		Trajet next;
		public Trajet(String villeD,String villeA,int kilometrageD,int kilometrageA,String limousine, Trajet next) {
			this.villeD= villeD;
			this.villeA= villeA;
			this.kilometrageD= kilometrageD;
			this.kilometrageA= kilometrageA;
			this.limousine= limousine;
			this.next= next;
		}
/*		public String toString() {
			return villeD+ "-->"+ villeA+ ","+ kilometrageD+ "-->"+ kilometrageA+ ","+ limousine;
		}
*/
		
		}
	
	public void insert(String villeD,String villeA,int kilometrageD,int kilometrageA,String limousine) {
		Trajet n= head;
		{while(n.next!= null)
			n=n.next;  }
	Trajet newTrajet= new Trajet(villeD,villeA,kilometrageD,kilometrageA,limousine,null);
	n.next= newTrajet;
	N++;}
	public void display() {
		if (head.next==null)
			System.out.println("empty");
		Trajet temp= head.next;
		for(int i=0; i<N; i++){
			System.out.println(temp.villeD+"-->"+temp.villeA+","+temp.kilometrageD+"-->"+temp.kilometrageA+","+temp.limousine);
			temp = temp.next;}
		System.out.println("\n");
		}
		
	
	
	/*@Override
	public Iterator<T> iterator() {
		return new LIterator();
	}
	
	private class LIterator implements Iterator{
		private Trajet n;
		public LIterator() {
			this.n= head;
		}
		@Override
		public boolean hasNext() {
			return n.next!=null;
		}
		@Override
		public Object next() {
			n= n.next;
			return n.toString();
		}
	}
	*/
	
	 
		
	}
	
	
	



	

