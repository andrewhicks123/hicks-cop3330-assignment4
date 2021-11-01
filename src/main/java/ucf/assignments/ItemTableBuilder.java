package ucf.assignments;

import javafx.scene.control.TableView;

import java.util.ArrayList;

public class ItemTableBuilder {

    private TableView<Item> table;
    private TableView.TableViewSelectionModel<Item> selection;

    public void buildTable(){
        // column 1

        // column 2

        // column 3

        // display message if empty

        // add columns

        // show columns
    }
    public void setTable(TableView<Item> table){ this.table = table; }
    public TableView<Item> getTable(){return table;}
    public TableView.TableViewSelectionModel<Item> getSelection(){return selection;}
    public void loadTable(ArrayList<Item> list){
        // iterate each item
        // add to table
    }
}
