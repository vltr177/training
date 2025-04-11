package com.javarush.games.game2048;

import com.javarush.engine.cell.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Game2048 extends Game{
    
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];
    private boolean isGameStopped = false;
    private int score;
    
    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    @Override
    public void onKeyPress(Key key){
        if ((key == Key.SPACE) && isGameStopped){
            isGameStopped = false;
            createGame();
            drawScene();
            return;
        }
        if (!canUserMove()) {
            gameOver();
            return;
        }
        if ((key == Key.LEFT) && !isGameStopped){
            moveLeft();
            drawScene();
        }
        else if ((key == Key.RIGHT) && !isGameStopped){
            moveRight();
            drawScene();
        }
        else if ((key == Key.UP) && !isGameStopped){
            moveUp();
            drawScene();
        }
        else if ((key == Key.DOWN) && !isGameStopped){
            moveDown();
            drawScene();
        }
    }
    
    private void createGame(){
        for (int i = 0; i < SIDE; i++)
            for( int j = 0; j < SIDE; j++)
                gameField[i][j] = 0;
        score = 0;
        setScore(score);
        createNewNumber();
        createNewNumber();
    }
    
    private void createNewNumber(){
        int x = getRandomNumber(SIDE);
        int y = getRandomNumber(SIDE);
        while (gameField[x][y] != 0){
            x = getRandomNumber(SIDE);
            y = getRandomNumber(SIDE);
        }
        if (getMaxTileValue() == 2048)
            win();
        int n = getRandomNumber(10);
        if (n == 9)
            gameField[x][y] = 4;
        else
            gameField[x][y] = 2;
    }
    
    private Color getColorByValue(int value){
        switch (value) {
            case 0:
                return Color.WHITE; 
            case 2:
                return Color.PLUM;
            case 4:
                return Color.SLATEBLUE;
            case 8:
                return Color.DODGERBLUE;
            case 16:
                return Color.DARKTURQUOISE;
            case 32:
                return Color.MEDIUMSEAGREEN;
            case 64:
                return Color.LIMEGREEN;
            case 128:
                return Color.DARKORANGE;
            case 256:
                return Color.SALMON;
            case 512:
                return Color.ORANGERED;
            case 1024:
                return Color.DEEPPINK;
            case 2048:
                return Color.MEDIUMVIOLETRED;
            default:
                return Color.NONE;
        }    
    }
    
    private void setCellColoredNumber(int x, int y, int value){
        Color color = getColorByValue(value);
        if (value != 0)
            setCellValueEx(x, y, color, Integer.toString(value));
        else
            setCellValueEx(x, y, color, "");
    }
    
    private void drawScene(){
        for (int x = 0; x < SIDE; x++)
            for (int y = 0; y < SIDE; y++)
                setCellColoredNumber(x, y, gameField[y][x]);
    }
    
    private boolean compressRow(int[] row){
        int[] copy = new int[row.length];
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < row.length; i++){
            if (row[i] != 0)
                array.add(row[i]);
            copy[i] = row[i];
            row[i] = 0;
        }
        for (int i = 0; i < array.size(); i++)
            row[i] = array.get(i);
        if (Arrays.equals(row,copy))
            return false;
        else
            return true;
    }

    private boolean mergeRow(int[] row){
        boolean result = false;
        for (int i = 1; i < row.length; i++){
            if ((row[i-1] == row[i]) && (row[i] != 0)){
                row[i-1] *= 2;
                score += row[i-1];
                setScore(score);
                row[i] = 0;
                result = true;
            }
        }
        return result;
    }

    private void moveLeft(){
        boolean move = false;
        for (int[] row : gameField) {
            if (compressRow(row) | mergeRow(row)) {
                if (!move) {
                    move = true;
                }
                compressRow(row);
            }
        }

        if (move) {
            createNewNumber();
        }
    }

    private void moveRight(){
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
    }

    private void moveUp(){
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
    }

    private void moveDown(){
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
    }
    
    private void rotateClockwise(){
        int[][] temp = new int[SIDE][SIDE];
        for (int i = 0; i < SIDE; i++)
            for (int j = 0; j < SIDE; j++)
                temp[i][j] = gameField[SIDE-1 - j][i];
        for (int i = 0; i < SIDE; i++)
            for (int j = 0; j < SIDE; j++)
                gameField[i][j] = temp[i][j];
    }
    
    private int getMaxTileValue(){
        int max = 0;
        for (int i = 0; i < SIDE; i++)
            for (int j = 0; j < SIDE; j++)
                if (gameField[i][j] > max)
                    max = gameField[i][j];
        return max;
    }
    
    private void win(){
        isGameStopped = true;
        showMessageDialog(Color.WHITE, "YOU WIN", Color.GREEN, 80);
    }

    private void gameOver(){
        isGameStopped = true;
        showMessageDialog(Color.WHITE, "GAME OVER", Color.RED, 80);
    }
    
    private boolean canUserMove(){
        for (int i = 0; i < SIDE; i++)
            for (int j = 0; j < SIDE; j++) {
                if (gameField[i][j] == 0)
                    return true;
                if ((i < SIDE-1) && (gameField[i][j] == gameField[i+1][j]))
                    return true;
                if ((j < SIDE-1) && (gameField[i][j] == gameField[i][j+1]))
                    return true;
            }
        return false;
    }
}
