package com.soft1841.oop.week1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URL;

public class ButtonApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL location = getClass().getResource("/fxml/Button.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(location);
        AnchorPane anchorPane = fxmlLoader.load();
        //获取屏幕大小
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        Scene scene = new Scene(anchorPane,1000,705);
        //添加样式
        scene.getStylesheets().addAll(
                "/css/style.css");
        //窗口标题
        primaryStage.setTitle("简书网");
        //设置窗体的logo
        //舞台设置场景
        primaryStage.setScene(scene);
        //舞台可见
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
