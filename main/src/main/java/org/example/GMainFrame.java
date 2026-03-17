package org.example;

import javax.swing.*;
import java.awt.*;

public class GMainFrame extends JFrame {
    //attributes
    private int size;

    //component
    private GMenuBar menuBar;
    private GToolBar toolBar;
    private GDrawingPanel drawingPanel;

    //associaton

    public GMainFrame() {
        //set attributes
        super("GMainFrame");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        //craete aggreation
        this.menuBar = new GMenuBar();
        this.setJMenuBar(this.menuBar);

        this.toolBar = new GToolBar();
        this.add(this.toolBar, BorderLayout.NORTH);

        this.drawingPanel = new GDrawingPanel();
        this.add(this.drawingPanel, BorderLayout.CENTER);
    }

    //member Function
    
}
