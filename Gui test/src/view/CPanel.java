package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class CPanel extends JPanel {

    private int width;
    private int height;
    private MainFrame mainFrame;
    private JPanel panel;
    private double[] coordinates;

    public CPanel(int width, int height, MainFrame mainFrame){
        this.mainFrame = mainFrame;
        this.setLayout(null);
        this.width = width;
        this.height = height;
        this.setSize(550, 500);
        setLocation(0, 0);
        setUp();
    }

    private void setUp() {
        panel = new JPanel();
        panel.setLayout(new GridLayout(10, 10));
        panel.setSize(new Dimension(500, 500));

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                JButton gridButton = new JButton();
                panel.add(gridButton);
                gridButton.setBackground(Color.BLUE);
                gridButton.addActionListener(e -> gridButton.setBackground(Color.RED));
                showCoordinates(i,j);
            }
        }

        this.add(panel);
        // gridButton.addActionListener(l -> mainFrame.buttonPressed(ButtonType.grid));

    }
    private void showCoordinates(int i, int j) {
        JOptionPane.showMessageDialog(null, "Button pressed at (" + i + "," + j + ")");
    }

    protected JPanel getGridButton() {
        return panel;
    }

    protected void resetGrid() {
        panel.removeAll();
        panel.revalidate();
        panel.repaint();
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                JButton gridButton = new JButton();
                panel.add(gridButton);
                gridButton.setBackground(Color.BLUE);
                gridButton.addActionListener(e -> gridButton.setBackground(Color.RED));
            }
        }
    }
    /*public CoordinateButton(double x, double y) {
        coordinates = new double[] {x, y};
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button pressed at: " + coordinates[0] + ", " + coordinates[1]);
            }
        }
    } */
}
