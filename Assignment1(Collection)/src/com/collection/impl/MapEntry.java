/**
 * 
 */
package com.collection.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author HGonge
 *
 */
public class MapEntry {
public Map<String, TreeSet<String>> getUserEntries()
{
	System.out.println("***** Enter TV Network and Shows *****");
	Map<String,TreeSet<String>> networkMap = new HashMap<String,TreeSet<String>>();
	Scanner scan = new Scanner(System.in);
	for(int i=0;i<10;i++) 
	{
		System.out.print("Input type Network : ");
		String network = scan.nextLine();
		System.out.print("Input Type Show " + network + ": ");
		String show = scan.nextLine();
		
		
		TreeSet<String> showSet = networkMap.get(network);
		if (showSet == null) 
		{
			showSet = new TreeSet<String>();
			showSet.add(show);
			networkMap.put(network, showSet);
		}
		else 
		{
			showSet.add(show);
		}
       
    }
	return networkMap;
	}
public void DisplayShows(Map<String, TreeSet<String>> networkMap)
{
	
	System.out.println("\n ******** Entry Inserted ******** \n");
	System.out.println(networkMap);
	System.out.println("\n ******************************** \n");
	
	System.out.println("\n ******** Sorted Order ******** \n");
	ArrayList<String> keyList = new ArrayList<String>(networkMap.keySet());
	Collections.sort(keyList);
	for (String networka: keyList) 
	{
		System.out.println(networka + ": " + networkMap.get(networka));
	}		
}
}
