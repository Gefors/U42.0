package view;

import javax.swing.*;
import java.awt.*;


public class MainPanel extends JPanel {

    private CPanel cPanel;
    private SPanel sPanel;

    public MainPanel(int width, int height, MainFrame mainFrame) {
        super(null);
        this.setSize(width, height);

        cPanel = new CPanel(width, height, mainFrame);
        add(cPanel, BorderLayout.CENTER);

        sPanel = new SPanel(width , height, mainFrame);
        add(sPanel, BorderLayout.SOUTH);
    }

    protected SPanel getsPanel() {
        return sPanel;
    }
    protected CPanel getcPanel() {
        return cPanel;
    }
}

