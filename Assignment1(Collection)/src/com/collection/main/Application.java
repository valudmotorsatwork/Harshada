/**
 * 
 */
package com.collection.main;

import java.util.Map;
import java.util.TreeSet;

import com.collection.impl.MapEntry;

/*
 * @ Harshada Gonge 
 * Date 07-07-2016
 */
public class Application {	

		public static void main(String[] args) 
		{
		     MapEntry mapEntry =new MapEntry();
			Map<String, TreeSet<String>> networkMap = mapEntry.getUserEntries(); 
			mapEntry.DisplayShows(networkMap);
		}
	}
