/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.model;

/**
 *
 * @author 2dam
 */
public class ModelImplementation implements Model{
    private String greeting="Hola Mundo!";
    
    public ModelImplementation(/*String greeting*/){
        //this.greeting=greeting;
    }

    public String getGreeting(){
        return this.greeting;
    }
}
