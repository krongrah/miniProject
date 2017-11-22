/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojectnovember;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jensd
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField nameField;
    @FXML
    private TextField addresseField;
    @FXML
    private TextField CO2SensorField;
    @FXML
    private TextField humSensorField;
    @FXML
    private TextField tempSensorField;
    @FXML
    private Button addButton;
    @FXML
    private TextArea textOutput;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonClick(ActionEvent event) {
        
    }
    
}
