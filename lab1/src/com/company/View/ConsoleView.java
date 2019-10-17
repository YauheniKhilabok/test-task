package com.company.View;

import com.company.Model.Question;
import com.company.Model.Test;

import java.util.List;

public class ConsoleView implements View{

    @Override
    public void ShowTests(List<Test> tests) {
        System.out.println(tests);
    }
}
