package com.springdem.model;

import java.util.HashMap;
import java.util.Map;

public class CarInstanceFactory {
     private Map<String, Car> cars=new HashMap<>();
     
     public void setCars(Map<String,Car> cars)
     {
    	 this.cars=cars;
     }
     public Car getCar(String key)
     {
    	 return cars.get(key);
     }
}
