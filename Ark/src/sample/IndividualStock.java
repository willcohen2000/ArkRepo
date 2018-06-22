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

public class IndividualStock extends AnchorPane implements Initializable {

    @FXML
    private Label tickerLabel;

    @FXML
    private Label stockLabel;

    @FXML
    private Label priceLabel;

    @FXML
    private Button clickedButton;

    private String ticker;
    private String stock;
    private String price;

    public FXMLLoader getLoader(IndividualStock controller) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("individualStock.fxml"));
        fxmlLoader.setController(controller);
        return fxmlLoader;
    }

    public void initialize(URL url, ResourceBundle rb) {
        tickerLabel.setText(ticker);
        stockLabel.setText(stock);
        priceLabel.setText(price);

        clickedButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello " + stock);
            }
        });
    }


    public void setItems(String ticker, String stock, String price) {
        this.ticker = ticker;
        this.stock = stock;
        this.price = price;
    }

    public void stockSelected() {
        System.out.println("Selected Stock");
    }

    public String getTicker() {
        return this.ticker;
    }

    public String getStock() {
        return this.stock;
    }

    public String getPrice() {
        return this.price;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
