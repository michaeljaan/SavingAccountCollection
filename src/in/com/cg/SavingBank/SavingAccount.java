package in.com.cg.advcollections;

import java.util.*;
public class SavingAccount 
{
	private double AccBalance;
	private int AccID;
	private String AccHolderName;
	private boolean isSalaried;
	public SavingAccount(double accBalance, int accID, String accHolderName, boolean isSalaried) 
	{
		super();
		AccBalance = accBalance;
		AccID = accID;
		AccHolderName = accHolderName;
		this.isSalaried = isSalaried;
	}
	public double getAccBalance() {
		return AccBalance;
	}
	public void setAccBalance(double accBalance) {
		AccBalance = accBalance;
	}
	public int getAccID() {
		return AccID;
	}
	public void setAccID(int accID) {
		AccID = accID;
	}
	public String getAccHolderName() {
		return AccHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		AccHolderName = accHolderName;
	}
	public boolean isSalaried() {
		return isSalaried;
	}
	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}
	
	public void Deposit(double amount)
	{
		this.AccBalance +=amount;
	}
	public void Withdraw(double amount)
	{
		this.AccBalance -=amount;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(AccBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((AccHolderName == null) ? 0 : AccHolderName.hashCode());
		result = prime * result + AccID;
		result = prime * result + (isSalaried ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingAccount other = (SavingAccount) obj;
		if (Double.doubleToLongBits(AccBalance) != Double.doubleToLongBits(other.AccBalance))
			return false;
		if (AccHolderName == null) {
			if (other.AccHolderName != null)
				return false;
		} else if (!AccHolderName.equals(other.AccHolderName))
			return false;
		if (AccID != other.AccID)
			return false;
		if (isSalaried != other.isSalaried)
			return false;
		return true;
	}
	public String toString()
	{
		return " SavingAccount [ AccID= " + getAccID() + " , AccHolderName=" + getAccHolderName() + " , AccBalance= " + getAccBalance() + " , IsSalaried= "+ isSalaried() + "]";
	}
}
