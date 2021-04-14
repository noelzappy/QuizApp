package com.zappy;

import java.awt.*;
import javax.swing.*;

public class MultipleChoiceQuestion extends Question {

    MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
        super(query);
        if (query.equals("") && a.equals("") && b.equals("") && c.equals("") && d.equals("") && e.equals("") && answer.equals("")) {
            throw new IllegalArgumentException("Please provide all parameters.");
        }
        else {
            addChoice("A",a);
            addChoice("B",b);
            addChoice("B",c);
            addChoice("C",d);
            addChoice("D",e);
            initQuestionDialog();
            correctAnswer = answer.toUpperCase();
        }
    }

    public void addChoice(String name, String label) {
        JPanel choice = new JPanel(new BorderLayout());
        JButton button = new JButton(name);
        button.addActionListener(question);
        choice.add(button, BorderLayout.WEST);
        choice.add(new JLabel(label + "  ", JLabel.LEFT), BorderLayout.CENTER);
        question.add(choice);
    }


}
