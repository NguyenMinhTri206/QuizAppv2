package com.nmt.quizzappv2;

import com.nmt.utils.MyAlertsingleton;
import com.nmt.utils.MyStageSingleton;
import com.nmt.utils.themes.ThemeManager;
import com.nmt.utils.themes.ThemesTypes;
import com.nmt.utils.themes.darkFactory;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class PrimaryController implements Initializable{
    @FXML private ComboBox<ThemesTypes> cbThemes;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ThemesTypes.values();
        this.cbThemes.setItems(FXCollections.observableArrayList(ThemesTypes.values()));
    }
    public void manageQuestions(ActionEvent e){
        MyStageSingleton.getInstance().showStage("quesitions");
    }
    
    public void practice(ActionEvent e){
                MyAlertsingleton.getInstance().showMsg("comming soon...");

    }
    
    public void exam(ActionEvent e){
                MyAlertsingleton.getInstance().showMsg("comming soon...");

    }
    
    public void changeTheme(ActionEvent e){
        this.cbThemes.getSelectionModel().getSelectedItem().updateTheme(this.cbThemes.getScene());
    }
    
}
