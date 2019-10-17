package com.company.Controller;

import com.company.Model.FileLayer;
import com.company.Model.ModelLayer;
import com.company.Model.Test;
import com.company.View.ConsoleView;
import com.company.View.View;

import java.util.List;

public class Controller {
    private ModelLayer modelLayer = new FileLayer();
    private View view = new ConsoleView();

    public void execute(){
        List<Test> tests = modelLayer.getTests();
        view.ShowTests(tests);
    }
}
