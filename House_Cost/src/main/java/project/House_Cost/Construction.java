package project.House_Cost;
import Main;
import java.io.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
public class Construction
	{
	private static final jdk.internal.instrumentation.Logger LOGGER = LogManager.getLogger(Construction.class);
	public void estimation() throws IOException
	   {
	        String standard,automation ;
	        double area,estimate;
	        
	        String type1="standard material",type2="above standard material",type3="highly standard material",automation1="no",automation2="yes";
	        Scanner sc = new Scanner (System.in);
	        LOGGER.info("enter the material of the house (standard material/above standard material/highly standard material)\n".getBytes());
	        standard = sc.nextLine();
	        LOGGER.info("enter whether the house is fully automated(yes/no) : \n".getBytes());
	        automation=sc.nextLine();
	        LOGGER.info("enter the area of the house : \n".getBytes());
	        area=sc.nextDouble();
	        if(standard.compareTo(type1)==0 && automation.compareTo(automation1)==0)
	        {
	            estimate=area*1200;
	            LOGGER.debug("The estimated cost is : %f \n",estimate);
	        }
	        else if(standard.compareTo(type2)==0 && automation.compareTo(automation1)==0)
	        {
	            estimate=area*1500;
	            LOGGER.debug("The estimated cost is : %f \n",estimate);
	        }
	        else if(standard.compareTo(type3)==0 && automation.compareTo(automation1)==0)
	        {
	            estimate=area*1800;
	            LOGGER.debug("The estimated cost is : %f \n",estimate);
	        }
	        else if(standard.compareTo(type3)==0 && automation.compareTo(automation2)==0)
	        {
	            estimate=area*2500;
	            LOGGER.debug("The estimated cost is : %f \n",estimate);
	        }
	        else
	            {
	                LOGGER.error("!!!Please Enter Correct Inputs!!!");
	            }
	    }

	}

