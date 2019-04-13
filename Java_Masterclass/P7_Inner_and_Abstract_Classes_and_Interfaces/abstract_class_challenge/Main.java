import java.lang.*;

public class Main{
	public static void main(String[] args){
		
		//SortedLinkedList<Integer> list = new SortedLinkedList<>();
		SortedTreeList<Integer> list = new SortedTreeList<>();
	
		System.out.println("List isEmpty() is: " + list.isEmpty() );
		System.out.println("List.size(): " + list.size() );
		
		list.add(5);
		list.add(69);
		list.add(100);
		list.add(0);
		list.add(5);
		list.add(-5);
		list.add(-24);
		
		System.out.println("List isEmpty() is: " + list.isEmpty() );
		System.out.println("list.size() " + list.size() );
		System.out.println(list.toString());
		
		System.out.println("List contains 5: " + list.contains(5) );
		
		System.out.println("List contains 500: " + list.contains(500));
		System.out.println("List contains -5: " + list.contains(-5));
		System.out.println("List contains a " + list.contains('a'));
		
		System.out.println("Get element at index 2: " + list.get(2));
		System.out.println("Get element at index 0: " + list.get(0));
		System.out.println("Get element at index 10: " + list.get(10));
		System.out.println("Get element at index -1: " + list.get(-1));
		/*
		System.out.println("Index of 5 is: " + list.indexOf(5));
		System.out.println("Index of -100 is: " + list.indexOf(-100));
		System.out.println("Index of a is: " + list.indexOf('a'));
		System.out.println("Index of -5 is: " + list.indexOf(-5));
		
		System.out.println("List before removes: " + list.toString());
		
		list.remove(Integer.valueOf(5));
		list.remove(Integer.valueOf(-100));
		list.remove(Integer.valueOf('a'));	
		
		list.remove(0);
		list.remove(100);
		list.remove(-1);		
		
		System.out.println("List after removes: " + list.toString());
		*/
		System.out.println("Testing clear()...");
		list.clear();
		System.out.println("list after calling clear(): " + list.toString());
		System.out.println("list empty: " + list.isEmpty());
		System.out.println("list size: " + list.size());
	}
}