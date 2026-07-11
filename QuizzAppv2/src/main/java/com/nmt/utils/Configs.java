/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nmt.utils;

import com.nmt.services.CategoryServices;
import com.nmt.services.LevelServices;
import com.nmt.services.questions.QuestionServices;
import com.nmt.services.questions.UpdateQuestionServices;

/**
 *
 * @author Administrator
 */
public class Configs {
    public static final CategoryServices cateServices = new CategoryServices();
    public static final QuestionServices questionServices = new QuestionServices();
    public static final LevelServices lvlServices = new LevelServices();
    public static final UpdateQuestionServices uQuestionServices = new UpdateQuestionServices();

}
