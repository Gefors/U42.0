package controller;

import view.ButtonType;
import view.MainFrame;

public class Controller {

    private MainFrame view;

    public Controller(){
        view = new MainFrame(550,600, this);
        view.enableAllButtons();
    }

    public void buttonPressed (ButtonType button){

        switch (button){
            case NewGameButton:
               //MainFrame hej = new MainFrame(550,600, this);
                //hej.getNewGrid();
                view.getNewGrid();
                break;

            case BoardOneButton:
                break;

            case BoardTwoButton:
                break;

            case grid:
                break;
        }
    }
}
