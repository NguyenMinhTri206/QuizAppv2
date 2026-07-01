/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.nmt.quizzappv2;

import com.nmt.pojo.Category;
import com.nmt.pojo.Question;
import com.nmt.services.CategoryServices;
import com.nmt.services.questions.QuestionServices;
import com.nmt.utils.MyConnectionSingleton;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class QuesitionsController implements Initializable {
    
   @FXML private ComboBox<Category> cbCates;
   @FXML private TableView<Question> tvQuestions;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        CategoryServices s = new CategoryServices();
        QuestionServices s2 = new QuestionServices();
        this.loadColums();
        try {
            this.cbCates.setItems(FXCollections.observableList(s.getCates()));
            this.tvQuestions.setItems(FXCollections.observableList(s2.getQuestion()));
        } catch (SQLException ex) {
            System.getLogger(QuesitionsController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
    private void loadColums(){
        TableColumn colId = new TableColumn("id");
        colId.setCellValueFactory(new PropertyValueFactory("id"));
        
        
        TableColumn colContent = new TableColumn("Noi dung cau hoi");
        colId.setCellValueFactory(new PropertyValueFactory("content"));
        colContent.setPrefWidth(300);

        this.tvQuestions.getColumns().addAll(colId, colContent);
    }
}
