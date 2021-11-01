package ucf.assignments;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AddNewItemController {
    @FXML private TextField itemDescriptionTextField;
    @FXML private TextField itemDueDateTextField;
    @FXML private Button addNewItemOkButton;
    @FXML private Button addNewItemCancelButton;
    private Item newItem;

    public void initialize(Item item) { this.newItem = item; }

    @FXML
    public void addNewItemOkButtonPressed(){
        // set description of new item
        // set due date of new item
        // get window of scene
    }
    @FXML
    public void addNewItemCancelButtonPressed(){
        // get the window
        // close window
    }
}
