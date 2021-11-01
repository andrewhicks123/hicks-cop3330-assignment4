package ucf.assignments;
import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Item> items;
    private String name;

    public ToDoList(){
        ArrayList<Item> items;
        this.name = "default";
    }

    public void addItem(Item item){
        items.add(item);
    }
    public void deleteItem(String description){
        for(Item item : items){

        }
    }
    public void deleteAllItems(){ items.clear(); }

    public Item getSingleItem(String description){


        return items.get(0);
    }
    public ArrayList<Item> getCompleteItems(){


        return items;
    }
    public ArrayList<Item> getIncompleteItems(){


        return items;
    }
}
