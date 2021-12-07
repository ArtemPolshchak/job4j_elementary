package ru.job4j.lambda;


import javax.swing.*;
import java.awt.*;

public class CreateButton extends JFrame {
    public CreateButton() throws HeadlessException {
        super("lambda");
        JButton test = new JButton("Test");
        JButton exit = new JButton("exit");

        test.addActionListener((x) -> System.out.println("TEST"));
        exit.addActionListener((x) -> System.exit(0));

        add(test);
        add(exit, BorderLayout.SOUTH);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new CreateButton();
    }

}
