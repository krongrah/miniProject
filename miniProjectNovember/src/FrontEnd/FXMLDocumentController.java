/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import Acquaintance.IBackEnd;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Krongrah
 */
public class FXMLDocumentController implements Initializable {

    IBackEnd backEnd;
    
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
    @FXML
    private ListView<?> buildingList;

    /**
     * Initializes the controller class.
     */
@Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        OutputStream o = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                textOutput.appendText(String.valueOf((char) b));
            }
        };
        System.setOut(new PrintStream(o, true));
        
    }  
        
    void importBackEnd(IBackEnd backEnd){
    this.backEnd=backEnd;
    }   

    @FXML
    private void buttonClick(ActionEvent event) {
        backEnd.addBuilding(nameField.getText(), addresseField.getText(),Integer.parseInt(tempSensorField.getText()),Integer.parseInt(humSensorField.getText()),Integer.parseInt(CO2SensorField.getText()));
    }
    
}
