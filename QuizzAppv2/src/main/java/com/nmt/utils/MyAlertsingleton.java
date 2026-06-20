/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nmt.utils;

import javafx.scene.control.Alert;

/**
 *
 * @author admin
 */
public class MyAlertsingleton {
    private static MyAlertsingleton instance;
    private final Alert alert;
    
    private MyAlertsingleton(){
        this.alert = new Alert(Alert.AlertType.INFORMATION);
        this.alert.setTitle("QuizApp");
        this.alert.setHeaderText("QuizApp");
    }
    public static MyAlertsingleton getInstance(){
        if(instance == null)
            instance = new MyAlertsingleton();
        
        return instance;
    }
    
    public void showMsg(String content){
        this.alert.setContentText(content);
        this.alert.show();
    }
}
