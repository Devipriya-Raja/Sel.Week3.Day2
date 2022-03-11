package week3.day2.assignments;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class PrintDuplicatesInArray {
	static int count=1;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			List<Integer> numberList = new ArrayList<Integer>();
			List<Integer> checkedList = new ArrayList<Integer>();
			List<Integer> duplicateList = new ArrayList<Integer>();
			List<Integer> distinctList = new ArrayList<Integer>();
			Collections.addAll(numberList, 14,12,13,11,15,14,18,16,17,19,18,17,20);
			distinctList.addAll(numberList);
			for (int i=0;i<numberList.size();i++){	
		        for (int j=i+1;j<numberList.size();j++) {
		        	if(checkedList.contains(numberList.get(i)))
						{	
		        		continue;
		        		}
							if((numberList.get(i)==numberList.get(j)) ) {
								count++;
								duplicateList.add(numberList.get(j));
								//System.out.println("Duplicates : "+duplicateList);
							    distinctList.remove(numberList.get(j));
							    
							}
							
					}   
		        //System.out.println("No.of occurences of " +numberList.get(i)+ ": "+count);
		        count=1;
		                checkedList.add(numberList.get(i)); 
		                     
				}
				
				
				System.out.println("Full List:"+numberList);
				System.out.println("Duplicates : "+duplicateList);
				//System.out.println("Removed Duplicates List:"+distinctList);
				
				
			}
			
		
		}


