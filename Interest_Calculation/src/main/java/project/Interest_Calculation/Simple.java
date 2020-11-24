package project.Interest_Calculation;

public class Simple extends Interest{
	public float calc_Interest(float amount,float rate_of_interest,int time,int compounded)
	{
		 return(amount*(1+(rate_of_interest/100)*time));	
	}
}
