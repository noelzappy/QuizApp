package com.zappy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

public class QuestionDialog extends JDialog implements ActionListener{

    String answer;
    @Override
    public void actionPerformed(ActionEvent e) {
        answer = e.getActionCommand();
        dispose();
    }

}
