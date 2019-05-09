/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.util.Hashtable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Arep
 */

@RestController
public class CarController {
    @Autowired
    CarService cs;
    
    @RequestMapping("/hello")
    public Hashtable<String, Car> getAll(){
        return cs.getAll();
    }
    
    /*Experimental on ArrayList Usage
    @RequestMapping("/{name}")
     public Car getCar2(@PathVariable("name") String name){
         return cs.getCar2(name);
     }*/
     
     @RequestMapping("/{id}")
     public Car getCar(@PathVariable("id") String id){
         return cs.getCar(id);
     }
}
