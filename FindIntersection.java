package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<Integer>();
		Collections.addAll(list1, 3,2,11,4,6,7);
		List<Integer> list2 = new ArrayList<Integer>();
		Collections.addAll(list2, 1,2,8,4,9,7);
		System.out.println(list1);
	    System.out.println(list2);
	    System.out.println("The Intersections are : ");
		for (int i=0;i<list1.size();i++)
		{
			for (int j=0;j<list2.size();j++)
			{
				if(list1.get(i)==list2.get(j)) 				
					System.out.println(list1.get(i));		
			}
		}
	}

}
