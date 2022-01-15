


import java.util.*;

public class Collections {
	public static void main(String[] args) {

		
		//creating arraylist
		System.out.println("**ArrayList**");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("vijayawada");//
	      city.add("hyderabad"); 
	      city.add("guntur");
	      city.add("bangloore");
	      city.add("mumbai");
	      for(String value : city)
	      System.out.println(value); 
		
		//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(15); 
	      vec.addElement(30);
	      vec.addElement(25);
	      for(int value : vec)
		      System.out.println(value); 
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Alex");  
	      names.add("John");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(103);  
	       set.add(102);
	       set.add(104);
	       for(int value : set)
			      System.out.println(value); 
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2);
	      	} 
	      }  

}