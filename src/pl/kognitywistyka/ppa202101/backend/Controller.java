package pl.kognitywistyka.ppa202101.backend;


import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;


public class Controller {

    @FXML CheckBox checkBox;
    @FXML ProgressBar progressBar;
    @FXML TextArea textArea;

    ScrollBar scrollBar;

    @FXML public void about(ActionEvent event){
        textArea.textProperty().set("You clicked on about");
    }

    public void close(ActionEvent actionEvent) {
        textArea.textProperty().set("You clicked on close, it doesnt't work");
    }

    public void delete(ActionEvent actionEvent) {
        textArea.textProperty().set("You clicked on delete, it doesnt't work");
    }

    public void scroll(MouseEvent mouseEvent) {
        textArea.textProperty().set("Done!");
        progressBar.setProgress(100);


    }

    public void clear(ActionEvent actionEvent) {
        textArea.clear();
    }


    public void click(ActionEvent actionEvent) {
        checkBox.setIndeterminate(false);

    }
}

