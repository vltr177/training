package com.javarush.games.ticktacktoe;

import com.javarush.engine.cell.*;

public class TicTacToeGame extends Game {
    
    private int[][] model = new int[3][3];
    private int currentPlayer;
    private boolean isGameStopped;
    
    @Override
    public void initialize(){
        setScreenSize(3, 3);
        startGame();
        updateView();
    }
    
    public void onMouseLeftClick(int x, int y){
        if (isGameStopped)
            return;
        if (model[x][y] != 0)
            return;
        setSignAndCheck(x, y);
        currentPlayer = 3 - currentPlayer;
        computerTurn();
        currentPlayer = 3 - currentPlayer;
    }
    
    public void onKeyPress(Key key){
        if((key == Key.SPACE) && isGameStopped){
            startGame();
            updateView();
        }
        else if (key == Key.ESCAPE){
            startGame();
            updateView();
        }
    }
    
    public void setSignAndCheck(int x, int y){
        model[x][y] = currentPlayer;
        updateView();
        if (checkWin(x, y, currentPlayer)){
            isGameStopped = true;
            showMessageDialog(Color.NONE, (currentPlayer == 1)? "You Win!":"Game Over", (currentPlayer == 1)? Color.GREEN:Color.RED, 75);
            return;
        }
        if (!checkWin(x,y, currentPlayer))
            if (!hasEmptyCell()){
                isGameStopped = true;
                showMessageDialog(Color.NONE, " Draw!",  Color.BLUE, 75);
                return;
        }
    }
    
    
    public void startGame(){
        isGameStopped = false;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                model[j][i] = 0;
        currentPlayer = 1; 
    }
    
    public void updateCellView(int x, int y, int value){
        switch (value) {
            case 1:
                setCellValueEx(x, y, Color.WHITE, "X", Color.RED);
                break;
            case 2:
                setCellValueEx(x, y, Color.WHITE, "O", Color.BLUE);
                break;
            default:
                setCellValueEx(x, y, Color.WHITE, " ", Color.WHITE);
        }
    }
    
    public void updateView(){
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                updateCellView(i, j, model[i][j]);
    }
    
    public boolean checkWin(int x, int y, int n){
        boolean check_x = true;
        boolean check_y = true;
        boolean check_d1 = true;
        boolean check_d2 = true;
        for (int i = 0; i < 3; i++){
            if (model[i][y] != n)
                check_x = false;
            if (model[x][i] != n)
                check_y = false;
            if (model[i][i] !=n)
                check_d1 = false;
            if (model[2-i][i] !=n)
                check_d2 = false;
        }
        return (check_x || check_y || check_d1 || check_d2);
    }
    
    public boolean hasEmptyCell(){
        boolean isNull = false;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (model[i][j] == 0)
                    return true;
        return false;            
    }
    
    public void computerTurn(){
        if (model[1][1] == 0){
            setSignAndCheck(1,1);
            return;
        }
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if ((model[i][j] == 0) && (checkFutureWin(i,j,currentPlayer))){
                    setSignAndCheck(i,j);
                    return;
                }
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if ((model[i][j] == 0) && (checkFutureWin(i,j,3-currentPlayer))){
                    setSignAndCheck(i,j);
                    return;
                }
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (model[i][j] == 0){
                    setSignAndCheck(i,j);
                    return;
                }
    }
    
    public boolean checkFutureWin(int x, int y, int n){
        int temp;
        if (model[x][y] != 0)
            return false;
        temp = model[x][y];
        model[x][y] = n;
        boolean result = checkWin(x,y,n);
        model[x][y] =  temp;
        return result;
    }
}
