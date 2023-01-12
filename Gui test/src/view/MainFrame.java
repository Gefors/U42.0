package view;
import controller.Controller;

import javax.swing.*;

public class MainFrame extends JFrame {

    private MainPanel mainPanel;
    private Controller controller;

    public MainFrame(int width, int height, Controller controller){
        super("Battleship");
        this.controller = controller;
        this.setResizable(false);
        this.setSize(width, height);
        this.mainPanel = new MainPanel(width, height,this);
        this.setContentPane(mainPanel);
        this.setLayout(null);
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void buttonPressed(ButtonType pressedButton){
        controller.buttonPressed(pressedButton);
    }
    public void enableAllButtons(){
        mainPanel.getsPanel().getNewGameButton().setEnabled(true);
        mainPanel.getsPanel().getBoardOneButton().setEnabled(true);
        mainPanel.getsPanel().getBoardTwoButton().setEnabled(true);
        mainPanel.getcPanel().getGridButton().setEnabled(true);
    }
  /*  public void getNewGrid(){
        mainPanel.getcPanel().getGridButton();
    } */
    public void getNewGrid(){
        mainPanel.getcPanel().resetGrid();
    }
}
