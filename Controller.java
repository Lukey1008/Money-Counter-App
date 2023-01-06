package com.example.moneycounter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.text.DecimalFormat;

public class Controller {

    @FXML
    public AnchorPane scenePane;
    @FXML
    private Button closeButton, resetButton, onePenceButton, twoPenceButton, fivePenceButton, tenPenceButton,
                    twentyPenceButton, fiftyPenceButton, onePoundButton, twoPoundButton,
                    fivePoundButton, tenPoundButton, twentyPoundButton, fiftyPoundButton;
    @FXML
    private Label moneyLabel;
    @FXML
    private Label totalText;
    private Stage stage;
    private float total = 0;
    private float newTotal = 0;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public void close(ActionEvent actionEvent) {
        stage = (Stage) scenePane.getScene().getWindow();
        stage.close();
    }
    public void reset(ActionEvent event){
        total = 0;
        newTotal = 0;
        totalText.setText("");
        moneyLabel.setText("Total Reset");
    }
    public void addOnePence(ActionEvent actionEvent) {
        moneyLabel.setText("1p - Added");
        total = newTotal;
        newTotal = total + 0.01f;

        totalText.setText(String.valueOf("£" + df.format(newTotal)));
    }
    public void addTwoPence(ActionEvent event){
        moneyLabel.setText("2p - Added");
        total = newTotal;
        newTotal = total + 0.02f;
        totalText.setText(String.valueOf("£" + df.format(newTotal)));
    }
    public void addFivePence(ActionEvent actionEvent) {
        moneyLabel.setText("5p - Added");
        total = newTotal;
        newTotal = total + 0.05f;
        totalText.setText(String.valueOf("£" + df.format(newTotal)));
    }
    public void addTenPence(ActionEvent actionEvent) {
        moneyLabel.setText("10p - Added");
        total = newTotal;
        newTotal = total + 0.10f;
        totalText.setText(String.valueOf("£" + df.format(newTotal)));
    }
    public void addTwentyPence(ActionEvent actionEvent) {
        moneyLabel.setText("20p - Added");
        total = newTotal;
        newTotal = total + 0.20f;
        totalText.setText(String.valueOf("£" + df.format(newTotal)));
    }
    public void addFiftyPence(ActionEvent actionEvent) {
        moneyLabel.setText("50p - Added");
        total = newTotal;
        newTotal = total + 0.50f;
        totalText.setText(String.valueOf("£" + df.format(newTotal)));
    }
    public void addOnePound(ActionEvent actionEvent) {
        moneyLabel.setText("£1 - Added");
        total = newTotal;
        newTotal = total + 1.00f;
        totalText.setText(String.valueOf("£" + df.format(newTotal)));
    }
    public void addTwoPound(ActionEvent actionEvent) {
        moneyLabel.setText("£2 - Added");
        total = newTotal;
        newTotal = total + 2.00f;
        totalText.setText(String.valueOf("£" + df.format(newTotal)));
    }
    public void addFivePound(ActionEvent actionEvent) {
        moneyLabel.setText("£5 - Added");
        total = newTotal;
        newTotal = total + 5.00f;
        totalText.setText(String.valueOf("£" + df.format(newTotal)));
    }
    public void addTenPound(ActionEvent actionEvent) {
        moneyLabel.setText("£10 - Added");
        total = newTotal;
        newTotal = total + 10.00f;
        totalText.setText(String.valueOf("£" + df.format(newTotal)));
    }
    public void addTwentyPound(ActionEvent actionEvent) {
        moneyLabel.setText("£20 - Added");
        total = newTotal;
        newTotal = total + 20.00f;
        totalText.setText(String.valueOf("£" + df.format(newTotal)));
    }
    public void addFiftyPound(ActionEvent actionEvent) {
        moneyLabel.setText("£50 - Added");
        total = newTotal;
        newTotal = total + 50.00f;
        totalText.setText(String.valueOf("£" + df.format(newTotal)));
    }
}