package com.gordon.osgi.remotetransalateasslt.impl;

import java.util.concurrent.ConcurrentHashMap;

import com.gordon.osgi.transalateasslt.service.TranslateService;

public class TranslateServiceRemoteImpl implements TranslateService {

private static final ConcurrentHashMap<String, String> dictonary = new ConcurrentHashMap<>();
	
	static {
		dictonary.put("cat", "miao");
		dictonary.put("dog", "putty");
	}
	

	@Override
	public String translate(String word) {
		
		System.out.println("TranslateServiceRemoteImpl-------------");
		String result = dictonary.get(word);
		if (null == result) {
			System.out.println("cannot find this word");
		}
		
		return result;
	}

}
