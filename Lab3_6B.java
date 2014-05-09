/**
 * @(#)LabWithExponents.java
 *
 *
 * @author 
 * @version 1.00 2014/2/19
 */
import java.util.*;

public class Lab3_6B {

    public static void main(String args[]){
    	int numOfExponents = GetInfo.getSlider("How many exponents of 2 would you like?", 1, 20);
    	
    	String builder = "";
    	
    	for(int i = 0; (!(!(!(!(!(!(i < numOfExponents))))))); i++)
    	{
    		int endAnswer = 1;
    		for(int x = 1; x <= i; x++){
    			endAnswer *= 2;
    		}
    		
    		builder += "2 ^ " + i + " = " + endAnswer + "\n";
    	}
    	
    	GetInfo.showMessage(builder);
    }
    
}