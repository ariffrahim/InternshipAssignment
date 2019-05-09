/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.util.ArrayList;
import java.util.Hashtable;
import org.springframework.stereotype.Service;

/**
 *
 * @author Arep
 */
@Service
public class CarService {
    
    //ArrayList Car2 = new ArrayList();
    Hashtable<String, Car> CarList = new Hashtable<String, Car>();
    public CarService()
    {
        Car a = new Car();
        a.setManufacture("Proton");
        a.setName("Saga");
        CarList.put("1", a);
        
        Car b = new Car();
        b.setManufacture("Perodua");
        b.setName("Ixora");
        CarList.put("2", b);
    }
    
    public Car getCar(String id)
    {
        if(CarList.containsKey(id))
            return CarList.get(id);
        else
            return null;
    }
    
    /* Experimental on ArrayList Usage
    public Car getCar2(String name)
    {
        Car temp;
        for(int i=0; i<Car2.size();i++)
        {
            temp = (Car) Car2.get(i);
            if(name.matches(temp.getName()))
                return temp;
        }
        return null;
    }*/
    
    public Hashtable<String, Car> getAll(){
        return CarList;
    }
    
}
