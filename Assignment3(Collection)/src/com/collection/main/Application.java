package com.collection.main;
import java.util.ArrayList;
import java.util.List;
import com.collection.impl.CalculateLength;
/**
 * Date:6July2016
 * Author: Harshada Gonge
 */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateLength calculateLength = new  CalculateLength();
		List<String> UserData = new ArrayList<String>();
		
		List<String> OutputData = new ArrayList<String>();
		UserData = calculateLength.getUserData();
		System.out.println("after user Data");
		OutputData =calculateLength.manipulateDataList(UserData);
		System.out.println("after output Data");
		calculateLength.printManipulatedList(OutputData);
		System.out.println("after print");
	}

}

