package fxml;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class FXMLController {
    @FXML
    private Text actiontarget;
    @FXML
    private TextField userName;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Button pressed for user \n" + userName.getText());
    }

}
