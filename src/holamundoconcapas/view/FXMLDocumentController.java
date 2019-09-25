/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * Controller class for JavaFX view implementation of hello world with tiers 
 * exercise. It contains the event handler for the ActionEvent on the view's button. 
 * @author javi
 */
public class FXMLDocumentController {
    private static final Logger LOGGER = Logger
            .getLogger("holamundoconcapas.view.FXMLDocumentController");
    /**
     * Reference to Label control of the UI.
     */
    @FXML
    private Label label;
    @FXML
    private Button button;
    /**
     * String object containing the greeting to be shown when button is clicked.
     */
    private String greeting;
    private Stage stage;
    /**
     * Setter for greeting attribute.
     * @param greeting 
     */
    public void setGreeting(String greeting){
        this.greeting=greeting;
    }

    /**
     * Metodo para iniciar Stage
     * @param root 
     */
    public void initStage(Parent root){
        try{
            LOGGER.info("Starting initStage method.");
            //Create scene an set document for it
            Scene scene=new Scene(root);
            //Set scene in stage and show it.
            stage.setScene(scene);
            stage.setOnShowing(this::onWindowShowing);
            button.setOnAction(this::handleButtonAction);
            stage.show();
            LOGGER.info("Ending initStage method.");
        }
        catch(Exception e){
            LOGGER.severe(e.getMessage());
        }
    }

    /**
     * Action event handler for the button in the UI. It shows the greeting using
     * the label control.
     * @param event 
     */
    
    private void handleButtonAction(ActionEvent event) {
        label.setText(greeting);
    }
    
    /**
     * 
     * @param e 
     */
    private void onWindowShowing(WindowEvent e){
        label.setText(greeting);
    }

    /**
     * 
     * @param stage 
     */
    void setStage(Stage stage) {
        this.stage=stage;
    }
}
