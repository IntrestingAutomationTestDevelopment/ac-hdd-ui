package org.acdigital.hdd.p_reservation.ui.ac_hdd_preservation_poc;

import java.util.HashMap;

public class Count_Repetitive_Charecters_In_String {
	public static void main(String[] args) {
		occurencesCheck();
	}

public static void occurencesCheck() {
	String str =  "Philippines";
	int count =0;
/*	for(int i=0;i<=str.length();i++) {
		
			for(int j=1;j>=i;j++) {
				if(str.charAt(j)= c[i]) {
					count++;
				}
			}
		
	}
	
	System.out.println("occurences of P"+count);
}*/
    HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
	char cEachSepearetedFromString[]  = str.toCharArray();
	for (char c : cEachSepearetedFromString)
    {
        if(charCountMap.containsKey(c))
        {
            //If char 'c' is present in charCountMap, incrementing it's count by 1

            charCountMap.put(c, charCountMap.get(c)+1);
        }
        else
        {
            //If char 'c' is not present in charCountMap,
            //putting 'c' into charCountMap with 1 as it's value

            charCountMap.put(c, 1);
        }
    }
     
    //Printing inputString and charCountMap 

    System.out.println(str+" : "+charCountMap);
}


}
