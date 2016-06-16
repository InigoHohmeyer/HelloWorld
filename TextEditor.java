package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.;
import java.lang.*;





/**
 * Created by Inigo Hohmeyer on 6/16/2016.
 */


public class TextEditor extends JFrame {
    private JTextArea area = new JTextArea(20,120);
    private JFileChooser dialog = new JFileChooser(System.getProperty("user.dir"));
    private String currentFile = "Untitled";
    private boolean changed = false;

public TextEditor(){
    area.setFont("Monospaced", Font.PLAIN,12));
    JScrollPane scroll = new JScrollPane(area,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    add(scroll,BorderLayout.CENTER;
    JMenuBar JMB = new JMenuBar();
    setJMenuBar(JMB);
    JMenu file = new JMenu("File");
    JMenu edit = new JMenu("Edit");
    JMB.add(file);
    JMB.add(edit);
file.add(New);file.add(Open);file.add(Save);
    file.addSeparator();

    for(int i=0; i<4; i++)
        file.getItem(i).setIcon(null);
    edit.add(Cut);edit.add(Copy);edit.add(Paste);

    edit.getItem(0)



}


}

