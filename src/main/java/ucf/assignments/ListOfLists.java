package ucf.assignments;

import java.util.ArrayList;

public class ListOfLists {
    private final ArrayList<ToDoList> lists = new ArrayList<>();

    public void addList(ToDoList newList){

        lists.add(newList);
    }
    public void deleteList(ToDoList list){
        lists.remove(list);
    }
    public void deleteAllLists(){lists.clear();}

    public ArrayList<ToDoList> getLists(){

        return lists;
    }
    public ToDoList getList(String name){

        return lists.get(0);
    }

}
