/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nmt.utils;

import com.nmt.quizzappv2.App;
import com.nmt.utils.themes.ThemeManager;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class MyStageSingleton {

    private static MyStageSingleton instance;
    private final Stage stage;

    private MyStageSingleton() {
        this.stage = new Stage();
        this.stage.setTitle("Quiz App");
    }

    public static MyStageSingleton getInstance() {
        if (instance == null) {
            instance = new MyStageSingleton();
        }

        return instance;
    }

    public void showStage(String fxml) {
        if (!this.stage.isShowing()) {
            Scene scene;
            try {
                scene = new Scene(new FXMLLoader(App.class.getResource(fxml + ".fxml")).load());
                ThemeManager.applyTheme(scene);
                this.stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                System.getLogger(MyStageSingleton.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }

        }
    }
}
