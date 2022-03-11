package week3.day2.assignments;

import java.util.LinkedList;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integerList = new LinkedList<Integer>();
		integerList.add(5);
		integerList.add(6);
		integerList.add(9);
		integerList.add(10);
		integerList.add(13);
		System.out.println("List : "+integerList);
		int first = integerList.get(0);
		int last  = integerList.get(integerList.size()-1);
		for(int i=first+1; i<last; i++){
		    if(!integerList.contains(i))
		          System.out.println("Number Not in List : "+i);
		}
	}

}
