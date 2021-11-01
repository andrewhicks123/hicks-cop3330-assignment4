package ucf.assignments;

import javafx.scene.control.TableView;

import java.util.ArrayList;

public class ListTableBuilder {

    private TableView<ToDoList> table;
    private TableView.TableViewSelectionModel<ToDoList> selection;

    public void buildTable(){
        // column 1

        // column 2

        // column 3

        // display message if empty

        // add colums

        // show colums
    }
    public void setTable(TableView<ToDoList> table){ this.table = table; }
    public TableView<ToDoList> getTable(){return table;}
    public TableView.TableViewSelectionModel<ToDoList> getSelection(){return selection;}
    public void loadTable(ArrayList<ToDoList> list){
        // iterate each item
        // add to table
    }
}
