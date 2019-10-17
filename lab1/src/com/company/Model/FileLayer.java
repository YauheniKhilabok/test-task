package com.company.Model;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileLayer implements ModelLayer{
    private String directory = System.getProperty("user.dir");
    private String IQTestsPath = "IQTests.txt";
    private String languageTestsPath = "languageTests.txt";
    private String mathTestsPath = "mathTests.txt";
    private String psycologicalTestsPath = "psycologicalTests.txt";
    private String testsPath = "tests.txt";

    private List<String> getLines(String path) {
        try {
            return Files.readAllLines(Paths.get(directory + "\\" + path), StandardCharsets.UTF_8);
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    public List<Test> getTests(){
        List<Test> tests = new ArrayList<>();
        List<Question> questions = new ArrayList<>();

        List<String> lines = getLines(testsPath);

        for(String line : lines){
            Test test = new Test();

            String[] sQuestions = line.split("-");
            for(String sQuestion : sQuestions){
                Question question = new Question();

                String[] fields = sQuestion.split(" ");

                List<String> rightAnswers = new ArrayList<>();
                question.setPoints(Integer.parseInt(fields[0]));
                question.setRightAnswer(fields[fields.length - 1]);
                for (int i = 1; i < fields.length - 1; i++){
                    rightAnswers.add(fields[i]);
                }
                question.setAnswers(rightAnswers);
                questions.add(question);
            }
            test.setQuestions(questions);
            tests.add(test);
        }

        return tests;
    }

    @Override
    public List<IQTest> getIQTests() {
        List<IQTest> tests = new ArrayList<>();
        List<Question> questions = new ArrayList<>();

        List<String> lines = getLines(testsPath);

        for(String line : lines){
            IQTest test = new IQTest();

            String[] sQuestions = line.split("-");
            for(String sQuestion : sQuestions){
                Question question = new Question();

                String[] fields = sQuestion.split(" ");

                test.setIQ(Integer.parseInt(fields[0]));
                List<String> rightAnswers = new ArrayList<>();
                question.setPoints(Integer.parseInt(fields[1]));
                question.setRightAnswer(fields[fields.length - 1]);
                for (int i = 2; i < fields.length - 1; i++){
                    rightAnswers.add(fields[i]);
                }
                question.setAnswers(rightAnswers);
                questions.add(question);
            }
            test.setQuestions(questions);
            tests.add(test);
        }

        return tests;
    }

    @Override
    public List<PsychologicalTest> getPsychologicalTests() {
        return null;
    }

    @Override
    public List<LanguageTest> getLanguageTests() {
        return null;
    }

    @Override
    public List<MathTest> getMathTests() {
        return null;
    }
}
