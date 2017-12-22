package Automation2018.AutoShow;

import java.util.ArrayList;

public class LearnArrayList {
	
	
	public void ArrayListTest()
	{
		 ArrayList arrList = new ArrayList();
	        
	        arrList.add("Abhishek");
	        arrList.add(1);
	        arrList.add("MH14AX3090");
	        arrList.add(2);
	        arrList.add("MH14EY1216");
	        
	        for (int i=0;i<arrList.size();i++)
	        {
	        	System.out.println(arrList.get(i));
	        }
	        
	        ArrayList<Integer> arrIntList = new ArrayList<Integer>();
	        
	        arrIntList.add(1);
	        arrIntList.add(2);
	        arrIntList.add(3);
	        
	        arrList.removeAll(arrIntList);
	        
	        for (int i=0;i<arrList.size();i++)
	        {
	        	System.out.println(arrList.get(i));
	        }
	        
	        		
	}
	
	
    		
}


