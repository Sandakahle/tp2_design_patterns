/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatterns.behavioral.templatemethod;

/**
 *
 * @author e-magination
 */
public class CheeseBurgerMeal extends Meal { 
    @Override 
    public void prepareIngredients() {
        System. out. println("Getting ground beef and Cheese"); 
    }
    @Override 
    public void cook() { 
        System. out. println("Cooking ground beef in pan");
    }
    @Override 
    public void eat() {
        System. out. println("The Cheese Burgers are tasty");
    }
    @Override 
    public void cleanUp() { 
        System. out. println("Doing the dishes"); 
    }
}
