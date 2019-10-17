package com.company.View;

import com.company.Model.Question;
import com.company.Model.Test;

public class ConsoleView implements View{

    @Override
    public void ShowQuestion(Question question) {
        System.out.println(question);
    }

    @Override
    public void ShowTest(Test test) {
        System.out.println(test);
    }
}
