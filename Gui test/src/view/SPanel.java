package view;

import javax.swing.*;


public class SPanel extends JPanel {

    private JButton NewGameButton;
    private JButton BoardOneButton;
    private JButton BoardTwoButton;

    private int width;
    private int height;
    private MainFrame mainFrame;

    public SPanel(int width, int height,MainFrame mainFrame ){
        this.mainFrame = mainFrame;
        this.setLayout(null);
        this.width = width;
        this.height = height;
        this.setSize(width, height);
        setLocation(0, 0);
        setUp();
    }


    public void setUp(){

        NewGameButton = new JButton("New Game");
        NewGameButton.setEnabled(true);
        NewGameButton.setSize(width / 5, 30);
        NewGameButton.setLocation(10, height - 75);
        NewGameButton.addActionListener(l -> mainFrame.buttonPressed(ButtonType.NewGameButton));
        setComponentZOrder(NewGameButton,0);
        this.add(NewGameButton);

        BoardOneButton = new JButton("Spelplan 1");
        BoardOneButton.setEnabled(true);
        BoardOneButton.setSize(width / 5, 30);
        BoardOneButton.setLocation(120, height - 75);
        BoardOneButton.addActionListener(l -> mainFrame.buttonPressed(ButtonType.BoardOneButton));
        this.add(BoardOneButton);

        BoardTwoButton = new JButton("Spelplan 2");
        BoardTwoButton.setEnabled(true);
        BoardTwoButton.setSize(width / 5, 30);
        BoardTwoButton.setLocation(230, height - 75);
        BoardTwoButton.addActionListener(l -> mainFrame.buttonPressed(ButtonType.BoardTwoButton));
        this.add(BoardTwoButton);

    }
    protected JButton getNewGameButton() {
        return NewGameButton;
    }
    protected JButton getBoardOneButton() {
        return BoardOneButton;
    }
    protected JButton getBoardTwoButton() {
        return BoardTwoButton;
    }

}
