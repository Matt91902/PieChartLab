package com.company;

/**
 * Implements a program with a pie chart
 * that shows interactive polling results for three candidates
 */

import java.awt.*;
import javax.swing.*;

public class Poll extends JFrame
{
    public Poll()
    {
        super("Vote for Tami, Brian, or Liz");

        Container c = getContentPane();
        c.setBackground(Color.WHITE);
        com.company.PollDisplayPanel chart = new com.company.PollDisplayPanel("Tami", "Brian", "Liz");
        com.company.PollControlPanel controls = new com.company.PollControlPanel(chart);
        c.add(chart, BorderLayout.CENTER);
        c.add(controls, BorderLayout.SOUTH);
    }

    public static void main(String[] args)
    {
        Poll w = new Poll();
        w.setBounds(300, 300, 400, 400);
        w.setDefaultCloseOperation(EXIT_ON_CLOSE);
        w.setVisible(true);
    }
}
