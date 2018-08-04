package in.com.cg.advcollections;

import java.util.Comparator;

public class SortByID implements Comparator<SavingAccount>
{
	public int compare( SavingAccount a, SavingAccount b)
	{
		return a.getAccID()-b.getAccID();
	}
}