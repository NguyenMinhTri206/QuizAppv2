/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nmt.utils.themes;

import javafx.scene.Scene;

/**
 *
 * @author admin
 */
public enum ThemesTypes {
    DEFAULT {
        @Override
        public void updateTheme(Scene scene) {
            ThemeManager.setTheme(new defaultFactory());
            ThemeManager.applyTheme(scene);
        }
    },DARK {
        @Override
        public void updateTheme(Scene scene) {
           ThemeManager.setTheme(new darkFactory());
            ThemeManager.applyTheme(scene);
        }
    },LIGHT {
        @Override
        public void updateTheme(Scene scene) {
            ThemeManager.setTheme(new lightFactory());
            ThemeManager.applyTheme(scene);
        }
    };
    
    public abstract void updateTheme(Scene scene);
}
