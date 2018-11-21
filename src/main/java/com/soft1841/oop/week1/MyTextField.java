package com.soft1841.oop.week1;

import javafx.scene.control.TextField;

public class MyTextField extends TextField {
    public MyTextField(){
        this.setStyle(" -fx-pref-width: 300px;" +
                "    -fx-pref-height: 35px;" +
                "    -fx-background-color: rgb(238, 238, 238);" +
                " -fx-text-fill: rgb(160, 160, 160);" +
                "    -fx-font-size: 16px;");
    }
}
