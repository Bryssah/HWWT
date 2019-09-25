/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas;

import holamundoconcapas.controller.Controller;
import holamundoconcapas.model.ModelFactory;
import holamundoconcapas.view.ViewFactory;

/**
 *
 * @author 2dam
 */
public class Application {
    public static void main(String[] args){
        ModelFactory model=new ModelFactory();
        ViewFactory view=new ViewFactory();
        Controller con=new Controller();
        con.run(view.getView(),model.getModel());
        //new Controller.run(ViewFactory.getView(),ModelFactory.getModel())
    }
   
}
