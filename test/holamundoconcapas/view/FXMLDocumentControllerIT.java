/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;


import javafx.stage.Stage;
import org.junit.Test;
import static org.testfx.api.FxAssert.verifyThat;
import org.testfx.framework.junit.ApplicationTest;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

/**
 *
 * @author 2dam
 */
public class FXMLDocumentControllerIT extends ApplicationTest{
    private final String GREETING="Hola Mundo!!!";
    
    public void start (Stage stage) throws Exception{
        JavaFXViewImplementation myapp=
                new JavaFXViewImplementation();
        myapp.setGreeting(GREETING);
        myapp.start(stage);
    }
    /*public FXMLDocumentControllerIT() {
    }*/

    @Test
    public void testSomeMethod() {
        clickOn("#button");
        verifyThat("#label",hasText(GREETING+GREETING));
    }
    
}
