/**
 * Date:6July2016
 * Author: Harshada Gonge
 */
package com.collection.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * @author Harsahada Gonge
 * Date: 6July2016
 * Manipulate Data From User
 */
public class CalculateLength {
	public List<String> manipulateDataList(List<String> data) {
	    for (int i=0; i<data.size(); i++) {
		if (data.get(i).length() == 4) {
			data.add(i, "****");
		    i++;
		}
	    }
	    return data;
	}
	/**
	 * @author Harsahada Gonge
	 * Date: 6July2016
	 * Get Data From User
	 */
	public List<String> getUserData() {
		// TODO Auto-generated method stub
		List<String> UserData = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter No. Of Strings You Want To Enter");
		int limit = scanner.nextInt();
		System.out.println("Enter "+ limit +" Strings To Check Length and Manipulate List");
		int cnt=0;
		while(cnt<=limit){
			UserData.add(scanner.nextLine());
			cnt++;
		}
		return UserData;
	}
	/**
	 * @author Harsahada Gonge
	 * Date: 6July2016
	 * Print The List After Proper Data Manipulation 
	 */
	public void printManipulatedList(List<String> outputData) {
		for(int i=0;i<outputData.size();i++)
		{
			System.out.println(outputData.get(i));
		}
	}
}
