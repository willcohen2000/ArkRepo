package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Button;

import java.awt.*;
import java.io.IOException;

public class Controller {

    @FXML
    private TilePane stocksTilePane;

    String[] tickers = {"GOOGL", "TSLA", "AMZN", "AVGO", "ADBE", "NVDA"};
    String[] stocks = {"Google", "Tesla", "Amazon", "Broadcom", "Adobe", "Nvidia"};
    String[] prices = {"$1170.02", "$337.16", "$1729.58", "$259.58", "$244.42", "$251.95"};

    public void initialize() {

        for (int i = 0; i < tickers.length; i++) {
            IndividualStock s1 = new IndividualStock();
            FXMLLoader loader = ((IndividualStock) s1).getLoader(s1);
            s1.setItems(tickers[i], stocks[i], prices[i]);
            try {
                stocksTilePane.getChildren().add(loader.load());
            } catch (IOException ie) {
                ie.printStackTrace();
            }
        }
    }

}
