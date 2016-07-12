package com.collection.main;
import java.util.List;
import com.collection.impl.RemoveBadPairs;;
/*
 * Write a method removeBadPairs that accepts an ArrayList of integers and removes any adjacent 
 * pair of integers in the list if the left element of the pair is larger than the right element of the pair
 * @author Harshada Gonge
 * Date 07-07-2016
 */
public class Application 
{
	public static void main(String [] args)
	{
		RemoveBadPairs removeBadPairs = new RemoveBadPairs();
	  	List<Integer> list=removeBadPairs.userInput();
        removeBadPairs.removeBadPairs(list);
	}
}