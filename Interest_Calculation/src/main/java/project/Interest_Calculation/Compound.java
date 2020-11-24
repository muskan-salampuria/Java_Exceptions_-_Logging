package project.Interest_Calculation;
import java.lang.Math;

public class Compound extends Interest{
	public float calc_Interest(float amount,float rate_of_interest,int time,int compounded)
	{
		 return(amount*(float)(Math.pow(1+(rate_of_interest/(100*compounded)),compounded*time)));	
	}
}
