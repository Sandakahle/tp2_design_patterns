/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatterns.behavioral.interpreter;

/**
 *
 * @author e-magination
 */
class Context { 
 
    private String input; 
    private String output; 
 
    public Context(String input) { 
        this.input = input; 
        this.output = "";
    } 
 
    public String getInput() { 
        return input; 
    } 
    public void setInput(String input) { 
        this.input = input; 
    } 
    public String getOutput() { 
        return output; 
    } 
    public void setOutput(String output) { 
        this.output = output; 
    } 
}