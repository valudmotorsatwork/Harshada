/**
 * 
 */
package com.arraylist.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author HGonge
 * Date 30 June 2016
 */
public class SwitchPair {
public void switchPair()
	{
		List<String> data = getInputFromUser();
		List<String> output = swapPairs(data);
		
		for(int i=0;i<output.size();i++)
			System.out.println(output.get(i));
	}

private List<String> getInputFromUser() {
	// TODO Auto-generated method stub
	List<String> InputData = new ArrayList<String>();
	System.out.println("Enter the sentence to add in list");
	Scanner scanner = new Scanner(System.in);
	String input = scanner.nextLine();
	if(input.contains(".")||input.contains(",")||input.contains("?")||input.contains("!")||input.contains("\"")||input.contains(";")||input.contains(":")||
    		input.contains("@")||input.contains("#")||input.contains("$")||input.contains("%")||input.contains("^")||input.contains("&")||input.contains("*")||
    		input.contains(")")||input.contains("(")||input.contains("[")||input.contains("]")||input.contains("}")||input.contains("{")||input.contains("<")||input.contains(">")||
    		input.contains("\\")||input.contains("/")||input.contains("`")||input.contains("~")||
    		input.contains("0")||input.contains("1")||input.contains("2")||input.contains("3")||input.contains("4")||input.contains("5")||input.contains("6")||input.contains("7")||input.contains("8")||input.contains("9")||input.contains("\\s"))
	{	
		System.out.println("Enter Proper String Without Any Punctuation Mark Or Special Character Or Numeric Value");
		InputData.add("");
	}	
	else
	{
	StringTokenizer st = new StringTokenizer(input);
	while(st.hasMoreTokens())
		InputData.add(st.nextToken());
	}
	return InputData;
}
public List<String> swapPairs(List<String> x) {

    for (int i=0; i< x.size()-1; i+=2) {
	String tmp = x.get(i);
	x.set(i, x.get(i+1));
	x.set(i+1, tmp);
    }
    return x;
}
}
