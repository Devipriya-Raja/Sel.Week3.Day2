package week3.day2.assignments;


		// TODO Auto-generated method stub
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

		public class FindSecondLargest {

			public static void main(String[] args) {
// 
				int[] arrayList = { 72, 8, 61, 501,798 ,101};
				
				//List<Integer> anotherList = Arrays.asList(999,185,9,841,12,9,18);
				

				List<Integer> list = new ArrayList<Integer>();

				for (Integer i : arrayList) {
					list.add(i);

				}

				System.out.println("Unsorted list : "+list);
				Collections.sort(list);
				System.out.println("Sorted list : "+list);

				System.out.println("Second largest using List (cant have duplicates) - " + list.get(list.size() - 2));

				
				  Set<Integer> set = new TreeSet<Integer>();
				 Collections.addAll(set,999,999,185,9,841,12,9,18);
				 //for (Integer j : anotherList) { set.add(j); }
				 List<Integer> list3= new ArrayList<Integer>(set);
				 System.out.println(list3);
				 System.out.println("Second largest using TreeSet (can have duplicates) - "+list3.get(list3.size() - 2));
				 
				 ArrayList<Integer> al = new ArrayList<Integer>();
				 al.add(1);
				 al.add(2);
				 al.add(3);
				 al.add(4);
				 System.out.println(al);

				 int j = Collections.max(al);

				 System.out.println("Max in the array is " + j);
				 al.remove(al.indexOf(j));
				 int max2 = Collections.max(al);
				 System.out.println("Second largest using Collections.max(Altering the array) is "+max2);
				 

			}

		}
	


