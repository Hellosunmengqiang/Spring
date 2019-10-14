package com.springdem.model;

import java.util.HashMap;
import java.util.Map;

public class CarStaticFactory {
	private static Map<String,Car> cars=new HashMap<>();
	
	static 
	{
		cars.put("1", new Car(1,"audi"));
		cars.put("2", new Car(2,"BMW"));
	}
	
    public static Car getCar(String key)
    {
    	return cars.get(key);
    	
    }
}
