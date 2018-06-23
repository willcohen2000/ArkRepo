package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;

public class NewsStory {

    @FXML
    private Label articleTitleLabel;

    @FXML
    private Label articleSourceLabel;

    @FXML
    private Button articleButton;

    private String ticker;
    private String stock;
    private String price;

    public FXMLLoader getLoader(NewsStory controller) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("NewsStory.fxml"));
        fxmlLoader.setController(controller);
        return fxmlLoader;
    }

    public void initialize(URL url, ResourceBundle rb) {
        articleButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello " + stock);
            }
        });
    }

}
