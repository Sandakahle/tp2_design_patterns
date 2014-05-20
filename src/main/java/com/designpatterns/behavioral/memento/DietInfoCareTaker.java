/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatterns.behavioral.memento;

/**
 *
 * @author e-magination
 */
public class DietInfoCareTaker {
    Object objMemento ;

    public void saveState( DietInfo dietInfo)
    {
        objMemento = dietInfo. save(); 
    } 
    
    public void restoreState( DietInfo dietInfo) 
    { 
        dietInfo. restore( objMemento);
    }
}

