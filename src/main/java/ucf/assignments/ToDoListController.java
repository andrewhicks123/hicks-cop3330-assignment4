package ucf.assignments;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.stage.FileChooser;
import javafx.stage.Window;

public class ToDoListController {

    @FXML
    private Button HomeButton;
    @FXML
    private Button AddItemButton;
    @FXML
    private Button EditItemButton;
    @FXML
    private Button DeleteItemButton;
    @FXML
    private Button ClearListButton;
    @FXML
    private Button ChangeStatusButton;
    @FXML
    private Button ViewAllButton;
    @FXML
    private Button ViewCompletedButton;
    @FXML
    private Button ViewIncompletedButton;

    @FXML
    private Label welcomeText;
    @FXML
    private TableView<Item> toDoListItemsView;

    private ToDoList ToDoList = new ToDoList();

    private final ItemTableBuilder tableOperator = new ItemTableBuilder();
    private final SceneOperator sceneOperator = new SceneOperator();
    private final FileChooser fileChooser = new FileChooser();
    private final FileOperator fileOperator = new FileOperator();


    @FXML
    public void HomeButtonPressed(){
        // ready mainscreen
        // load and show mainscreen
    }
    @FXML
    public void AddItemButtonPressed() {
        // create new item
        // get current list
        // get text box
        // get controller
        // initalize controller
        // pop up text box
        // add item to items of list
        // refresh table


    }
    @FXML
    public void DeleteItemButtonPressed() {
        // get item and list
        // remove it from list
        // remove from table
        // refresh table

    }
    @FXML
    public void EditItemButtonPressed() {
        // get selected item
        // remove from list
        // remove from table
        // get the textbox
        // get controller
        //initalize controller
        // show text box
        // add updated item to list
        //add updated item to table

    }
    @FXML
    public void ChangeStatusButtonPressed() {
        // get item and list
        // remove item from list
        //remove  item from table
        // change status
        // add item to list
        // add item back to table

    }
    @FXML
    public void ClearListButtonPressed() {
        // get list
        // clear that list


    }
    @FXML
    public void ViewAllButtonPressed(){
        // get all list
        // update table
    }
    public void ViewIncompletedButtonPressed(){
        // get incomplete list
        // update table

    }
    public void ViewCompletedButtonPressed(){
        // get complete list
        // update table

    }

}