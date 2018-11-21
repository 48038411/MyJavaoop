package com.soft1841.oop.week1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class ButtonController implements Initializable {
    @FXML
    private SearchButton searchBtn;
    @FXML
    private MyButton search1;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image searchImg = new Image("/img/camera.png");
        ImageView searchImgView = new ImageView(searchImg);
        Image search = new Image("/img/search.png");
        ImageView imageView = new ImageView(search);
        searchImgView.setFitWidth(25);
        searchImgView.setFitHeight(25);
        searchBtn.setGraphic(searchImgView);
        search1.setGraphic(imageView);
    }
}
