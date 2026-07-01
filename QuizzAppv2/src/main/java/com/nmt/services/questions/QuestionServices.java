/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nmt.services.questions;

import com.nmt.pojo.Category;
import com.nmt.pojo.Question;
import com.nmt.utils.MyConnectionSingleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class QuestionServices {
    public List<Question> getQuestion() throws SQLException{
        Connection conn = MyConnectionSingleton.getInstance().connect();

        //b3 thuc thi truy van
        String sql = "SELECT * FROM question";
        PreparedStatement stm = conn.prepareStatement(sql);
        ResultSet rs = stm.executeQuery(sql);
        
        List<Question> questions = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String content = rs.getString("name");
            
            questions.add(new Question.Builder().setContent(content).setId(id).build());
        }
        return questions;
    }
}
