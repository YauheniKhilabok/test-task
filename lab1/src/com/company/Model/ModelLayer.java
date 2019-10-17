package com.company.Model;

import java.io.IOException;
import java.util.List;

public interface ModelLayer {
    List<Test> getTests();
    List<IQTest> getIQTests();
    List<PsychologicalTest> getPsychologicalTests();
    List<LanguageTest> getLanguageTests();
    List<MathTest> getMathTests();
}
