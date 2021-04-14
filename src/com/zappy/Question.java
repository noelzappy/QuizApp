package com.zappy;

import java.awt.*;
import javax.swing.*;

public abstract class Question {
    // These variables are used to keep track of how many questions the user answered
    // and how many they got right
    static int nQuestions = 0;
    static int nCorrect = 0;
    QuestionDialog question;
    String correctAnswer;

    Question(String question) {
        this.question = new QuestionDialog();
        this.question.setLayout(new GridLayout(0,1));
        this.question.add(new JLabel(" " + question +  " ",JLabel.CENTER));
    }

    String ask() {
        question.setVisible(true);
        return question.answer;
    }

    void initQuestionDialog() {
        this.question.setModal(true);
        this.question.pack();
        this.question.setLocationRelativeTo(null);
    }

    // The check method declaration
    // This method checks if the response given by the user is correct or not and
    // it gives the appropriate message to the user depending on the answer
    void check() {
        nQuestions++;
        String answer = ask();
        if(answer.equals(correctAnswer)) {
            JOptionPane.showMessageDialog(null, "Correct!");
            nCorrect++;
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect\nThe correct answer was: " + correctAnswer);
        }
    }

    static void showResults() {
        JOptionPane.showMessageDialog(null, nCorrect + " Correct answers out of " + nQuestions + " questions");
    }
}

