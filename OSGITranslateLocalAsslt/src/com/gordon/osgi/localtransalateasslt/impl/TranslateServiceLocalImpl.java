package com.gordon.osgi.localtransalateasslt.impl;

import java.util.concurrent.ConcurrentHashMap;

import com.gordon.osgi.transalateasslt.service.TranslateService;

public class TranslateServiceLocalImpl implements TranslateService {
	
	private static final ConcurrentHashMap<String, String> dictonary = new ConcurrentHashMap<>();
	
	static {
		dictonary.put("China", "CHINA");
		dictonary.put("USA", "STATE");
	}
	

	@Override
	public String translate(String word) {
		
		System.out.println("TranslateServiceLocalImpl-------------");
		String result = dictonary.get(word);
		if (null == result) {
			System.out.println("cannot find this word");
		}
		
		return result;
	}

}
