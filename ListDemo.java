import java.util.*;

public class ListDemo 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>();		        //List1 created
		list1.add(0,1);		                                        //Adds 1 at index 0
		list1.add(1,2);		                                       //Adds 2 at index 1
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<Integer>();		     //List2 created
		list2.add(1);
		list2.add(2);
		list2.add(3);
		
		list1.addAll(1,list2);		                            //adding list2 from index 1
		System.out.println(list1);
		list1.remove(1);			                               //remove element from index 1
		System.out.println(list1);
		list1.set(0, 5);			                               //replace 0th element with 5
		System.out.println(list1);		
	}
}


/* Output:
[1, 2]
[1, 1, 2, 3, 2]
[1, 2, 3, 2]
[5, 2, 3, 2]
*/
