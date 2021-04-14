package com.zappy;

import javax.swing.*;
public class TrueFalseQuestion extends Question {

    TrueFalseQuestion (String question, String answer) {
        super(question);
        JPanel buttons = new JPanel();
        addButton(buttons, "TRUE");
        addButton(buttons, "FALLSE");
        this.question.add(buttons);
        initQuestionDialog();
        this.correctAnswer = answer;
    }


    void addButton(JPanel buttons, String label) {
        JButton button = new JButton(label);
        button.addActionListener(question);
        buttons.add(button);
    }

}
