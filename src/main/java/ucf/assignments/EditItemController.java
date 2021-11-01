package ucf.assignments;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class EditItemController {
    @FXML
    private TextField itemDescriptionTextField;
    @FXML
    private TextField itemDueDateTextField;
    @FXML
    private Button editItemOkButton;
    @FXML
    private Button editItemCancelButton;
    private Item item;

    public void initialize(Item item){

    }
    @FXML
    public void editItemOkButtonPressed(){
        // set new desc
        // get window
        // close window
    }
    @FXML
    public void editItemCancelButtonPressed(){
        // get window
        // close window
    }

}
