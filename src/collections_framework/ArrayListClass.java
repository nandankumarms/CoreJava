package collections_framework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
	public static void main(String[] args) {
		
		//Create ArrayList
		ArrayList list=new ArrayList();
		
		//Method to check whether the ArrayList is empty or not
		boolean arrayListEmpty=list.isEmpty();
		if(arrayListEmpty) System.out.println("ArrayList is empty");
		
		//To add eliments to  the Arraylist
		list.add(1);// integer, byte, short, long
		list.add(1.2f);//float
		list.add(10.23);//double
		list.add('a');//character
		list.add("Nandan");//string
		list.add("Nandan");// Duplicate value
		list.add(null);// Null value
		
		//check the size
		System.out.println("Size of ArrayList is "+list.size());
		
		//Check if the ArrayList is Empty or not
		arrayListEmpty=list.isEmpty();
		if(arrayListEmpty) System.out.println("ArrayList is empty");
		else System.out.println("ArrayList is not empty");
		
		System.out.println();
		
		//To print the ArrayList
		System.out.println("ArrayList Elements "+list);
		System.out.println();
		
		System.out.println("ArrayList elements with respect to index");
		//To get or print the element with the help of index
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(list.size()-1));
		
		System.out.println();
	  
		//To iterate or traverse the ArrayList
		System.out.println("Traversing or iterating the values of ArrayList using for loop.");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		//To ierate the values of arrayList using for-each loop
		/*
		 * Syntax of for-each loop
		 *   for(data_type variable : referenceVariable) {
		 *   ...body
		 *   }
		 *   
		 *   Using for-each loop we can traverse only in forward direction.
		 */
		System.out.println("Iterating the values using for each loop");
		for(Object obj:list) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		//Iterating the values of ArraList using Iterator
		/*
		 *iterator will be created for all each collections whenever any collection is created.
		 */
		System.out.println("Iterating the values of arrayList using Iterator");
		Iterator iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
		
		
		//Remove data from the ArrayList
		/*
		 * We Have two overloaded method to removes data from the list
		 * 1. arrayList.remove(int index);
		 * 2. arrayList.remove(Object obj);
		 */
		System.out.println("Removed Value from index 0");
		list.remove(0);// Using index
		System.out.println(list);
		System.out.println();
		
		System.out.println("Removed value from index 5");
		list.remove(5);// Using index
		System.out.println(list);
		System.out.println();
		
		System.out.println("Removed Nandan from arrayList");
		list.remove("Nandan");//Using value or data or object. It will remove only the first matching data.
		System.out.println(list);
		System.out.println();
		
		System.out.println("Removed 10.23 from the list");
		list.remove(10.23);
		System.out.println(list);
		System.out.println();
		
		
				
		//Method print the index of elements
		System.out.println("Printing the index of Nandan");
		System.out.println(list.indexOf("Nandan"));
		System.out.println();
		
		//Adding a element to array list again
		list.add("Nandan");
		list.add("Nandan");
		System.out.println(list);
		//Method print the index of elements
		System.out.println("Printing the index of Nandan");
		System.out.println(list.indexOf("Nandan")); //Start Comparison from the start of index and return the index of first matching element
		System.out.println(list.lastIndexOf("Nandan"));//Start Comparision from the start of index and return the index of last matching element
		System.out.println();
		
		//Overloaded method of add() to add value to the given index
		System.out.println("Adding value \"Gagan\" to the index 0 ");
		list.add(0, "Gagan");
		System.out.println(list);
		System.out.println();
		
		
		//Method to replace the value in the given index.
		System.out.println("Replacing the value present in the index 1 with \"Manjunath\"");
		list.set(1, "Manjunath");
		System.out.println(list);
		
		//Creating ArrayList to store only Integers using generics
		ArrayList<Integer> intList=new ArrayList<Integer>();
		intList.add(1);
//		intList.add('a'); //Gives error
//		intList.add("Nandan"); //Gives error
//		intList.add(10.2f); //Gives error
//		intList.add(10.5); //Gives error
		intList.add(1);
		System.out.println();
		
		//Add elements of one ArrayList to another ArrayList
		System.out.println("New ArrayList");
		ArrayList a1=new ArrayList<>();
		a1.add(10);
		a1.add(20);
		System.out.println(a1);
		System.out.println();
		a1.add(list);            //Comment this line and uncomment the below commented line and execute to see the difference
		System.out.println(a1);
		
		System.out.println(a1.size());
		
//		a1.addAll(a1);    
//		System.out.println(a1);
//		System.out.println(a1.size());
		
		//Check whether the AraayList contains the given element or not
		System.out.println(a1.contains(10));
		System.out.println(a1.contains(100));
		
		//Check whether the ArrayList contains all the elements of given collection.
		System.out.println(a1.containsAll(list));
		System.out.println(list.containsAll(a1));
		
	}


}
