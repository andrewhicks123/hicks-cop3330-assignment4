package ucf.assignments;


import java.io.File;


public class FileOperator {
    private String filePath;
    private String fileName;

    private void createFile(File file){
        // create file

    }
    private void writeToFile(String data){
        // write string to file

    }
    private ToDoList jsonToJava(){
        return null;
    }
    private String jsonToJson(ToDoList list){
        return null;
    }
    private boolean isFile(File file){
        return true;
    }
    public void setFilePath(String filePath){
        this.filePath = filePath;
    }
    public String getFilePath(){ return filePath; }

    public void setFileName(String title){
        this.fileName = title;

    }
    public void saveToDoList(ToDoList list, File file){

    }
    public ToDoList loadToDoList(File file){

        return null;
    }
}
