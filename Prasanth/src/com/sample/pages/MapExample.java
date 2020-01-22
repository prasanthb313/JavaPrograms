package com.sample.pages;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
public static void main(String[] args) {
	Map<String, String> ref=new HashMap<String, String>();
	ref.put("b","prasanth");
	ref.put("rollNum","313");
	Set<String> set=ref.keySet();
	Iterator<String> itr=set.iterator();
	while(itr.hasNext())
	{
		System.out.println(ref.get(itr.next()));
	}
}
}


