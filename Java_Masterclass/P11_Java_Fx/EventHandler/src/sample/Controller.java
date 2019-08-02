package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Controller {
    /****************************************** Fields *************************************************/
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;
    @FXML
    private CheckBox ourCheckBox;
/********************************************** Methods *************************************************/
/** Initialize method ***********************************************************************************/
    @FXML
    public void initialize(){
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }
    /** Action to perform depending on which button is pushed ******************************************/
    @FXML
    public void onButtonClicked(ActionEvent e){

        System.out.println("Name: " + nameField.getText());
        System.out.println("The following button was pressed: " + e.getSource());

        if(e.getSource().equals(helloButton)){
            System.out.println("Hello " + nameField.getText());
        }
        else if(e.getSource().equals(byeButton)){
            System.out.println("Goodbye " + nameField.getText());
        }
/*
        try{
            Thread.sleep(10000);
        }catch(InterruptedException event){
            //don't care about this
        }
*/
        if(ourCheckBox.isSelected()){
            nameField.clear();
            helloButton.setDisable(true);
            byeButton.setDisable(true);
        }
    }
    /** Test for text in textField before activating buttons ******************************************/
    @FXML
    public void handleKeyReleased(){
        String text = nameField.getText();
        boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disableButtons);
        byeButton.setDisable(disableButtons);
    }

    @FXML
    public void handleChange(){
        System.out.println("Checkbox is " + (ourCheckBox.isSelected() ? "checked" : "not checked"));
    }
}
