package ucf.assignments;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import java.io.IOException;


public class SceneOperator {
    private FXMLLoader loader;

    @FXML
    public Parent readyScene(Views view){
        Parent page = null;

        // load View
        return page;
    }
    @FXML
    public void popUpScene(String title, Parent page){
        // new stage
        // set title
        // set to scene page
    }
    @FXML
    public FXMLLoader getLoader() { return loader; }
}
