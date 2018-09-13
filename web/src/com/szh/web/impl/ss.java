package com.szh.web.impl;

import java.util.HashSet;
import java.util.Set;

public class ss {
	public static void main(String[] args) {
		Set<String> list = new HashSet<String>();
		for(int i=0;i<100;i++) {
			list.add(i+"");
		}
		
		for(int i=0;i<list.size();i++) {
			String x =(String) list.toArray()[i];
			System.out.println(x);
		}
		
	}
}
