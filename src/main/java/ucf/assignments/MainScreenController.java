package ucf.assignments;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.stage.FileChooser;
import javafx.stage.Window;

public class MainScreenController {

    @FXML
    private Button CreateListButton;
    @FXML
    private Button DeleteListButton;
    @FXML
    private Button EditListButton;
    @FXML
    private Button ViewListButton;
    @FXML
    private Button OpenFileButton;
    @FXML
    private Button SaveFileButton;

    @FXML
    private Label welcomeText;
    @FXML
    private TableView<ToDoList> toDoListListsView;

    private ListOfLists lists = new ListOfLists();

    private final ItemTableBuilder tableOperator = new ItemTableBuilder();
    private final SceneOperator sceneOperator = new SceneOperator();
    private final FileChooser fileChooser = new FileChooser();
    private final FileOperator fileOperator = new FileOperator();

    @FXML
    public void CreateListButtonPressed() {
        // create new ToDoList

        // get the text box

        // get the controller

        //initalize controller

        // pop up window

        // add new ToDoList to lists

        // refresh the main table

    }
    @FXML
    public void DeleteListButtonPressed() {
        // get selected list

        // remove list from lists

        // remove list from the table

        // refresh the table

    }
    public void ViewListButtonPressed(){
        // get selection

        // load list screen

        // build table

        // show table
    }
    public void OpenFileButtonPressed(){
        // open file window
    }
    public void SaveFileButtonPressed(){
        // open file window
        // run FileOperator functions
    }
    public void EditListButtonPressed(){
        // get selection

        // delete selection

        // promt edit list screen

        // create list

        // update view
    }
}
