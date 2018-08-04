package in.com.cg.advcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class BankAccountList
{

	public static void main(String[] args) 
	{
		ArrayList arr=new ArrayList();
		
		SavingAccount SA1= new SavingAccount(5000, 101, "Mike", true);
		SavingAccount SA2 =new SavingAccount(9000, 105,"Jaan", false);
		SavingAccount SA3= new SavingAccount(8000, 103,"Rafa", true);
		SavingAccount SA4= new SavingAccount(4000, 104, "Nada", false);
		SavingAccount SA5= new SavingAccount(4000, 104, "Nada", false);
		
		arr.add(SA1);
		arr.add(SA2);
		arr.add(SA3);
		arr.add(SA4);
		arr.add(SA5);
		
		Collections.sort(arr,new SortByID());
		
		arr.stream().forEach((arr1) -> System.out.println(arr1));
		System.out.println("\n");
		Set<Object> set=new LinkedHashSet<>();
		
		set.add(SA1);
		set.add(SA2);
		set.add(SA3);
		set.add(SA4);
		set.add(SA5);
		
	//Collections.sort(set,new SortByID());

		set.stream().forEach((list1) -> System.out.println(list1));
	//rr.stream().forEach((arr1) -> System.out.println(arr1));

	}

}
