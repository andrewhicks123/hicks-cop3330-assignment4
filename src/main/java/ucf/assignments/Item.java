package ucf.assignments;

public class Item {

    private String description;
    private String dueDate;
    private boolean status;

    public Item(){
        this.description = "description";
        this.dueDate = "YYYY-MM-DD";
        this.status = false;
    }
    public void setDescription(String desc){

    }
    public String getDescription(){
        return description;
    }
    public void setDueDate(String dueDate){

    }
    public String getDueDate(){
        return dueDate;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    public boolean isStatus(){
        return status;
    }
}
