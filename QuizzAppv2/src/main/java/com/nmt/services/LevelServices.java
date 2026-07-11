/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nmt.services;

import com.nmt.pojo.Category;
import com.nmt.pojo.Level;
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
public class LevelServices {
    public List<Level> getLevels() throws SQLException {
        Connection conn = MyConnectionSingleton.getInstance().connect();

        //b3 thuc thi truy van
        String sql = "SELECT * FROM level";
        PreparedStatement stm = conn.prepareCall(sql);
        ResultSet rs = stm.executeQuery(sql);
        
        List<Level> levels = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            
            levels.add(new Level(id,name));
        }
        return levels;
    }
}
