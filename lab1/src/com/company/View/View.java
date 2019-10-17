package com.company.View;

import com.company.Model.Question;
import com.company.Model.Test;

public interface View {
    void ShowQuestion(Question question);

    void ShowTest(Test test);
}
