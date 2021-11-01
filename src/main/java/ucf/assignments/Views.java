package ucf.assignments;

public enum Views {
    MAIN("ToDoListApplication.fxml"),
    ADDITEM("AddItem.fxml"),
    EDITITEM("EditItem.fxml"),
    ADDLIST("AddList.fxml"),
    EDITLIST("EditList.fxml");

    private final String fileName;

    Views(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

}
