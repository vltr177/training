package com.javarush.games.minesweeper;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;
    private static final String MINE = "\uD83D\uDCA3";
    private static final String FLAG = "\uD83D\uDEA9";
    private int countFlags;
    private boolean isGameStopped;
    private int countClosedTiles = SIDE*SIDE;
    private int score;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }
    
    @Override
    public void onMouseLeftClick(int x, int y){
        if (isGameStopped)
            restart();
        else    
            openTile(x, y);
    }
    
    @Override
    public void onMouseRightClick(int x, int y){
        markTile(x, y);
    }

    private void createGame() {
        for (int y = 0; y < SIDE; y++){
            for (int x = 0; x < SIDE; x++){
                gameField[y][x] = new GameObject(x, y, false);
                gameField[y][x].isFlag = false;
                setCellValue(x, y, "");
            }
        }    
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                boolean isMine = getRandomNumber(10) < 1;
                if (isMine) {
                    countMinesOnField++;
                }
                gameField[y][x].isMine = isMine;
                setCellColor(x, y, Color.ORANGE);
            }
        }
        countMineNeighbors();
        countFlags = countMinesOnField;
    }

    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> result = new ArrayList<>();
        for (int y = gameObject.y - 1; y <= gameObject.y + 1; y++) {
            for (int x = gameObject.x - 1; x <= gameObject.x + 1; x++) {
                if (y < 0 || y >= SIDE) {
                    continue;
                }
                if (x < 0 || x >= SIDE) {
                    continue;
                }
                if (gameField[y][x] == gameObject) {
                    continue;
                }
                result.add(gameField[y][x]);
            }
        }
        return result;
    }
    
    private void countMineNeighbors(){
        for (int y = 0; y < SIDE; y++){
            for (int x = 0; x < SIDE; x++){
                if (!gameField[y][x].isMine){
                    for (GameObject neighbors : getNeighbors(gameField[y][x])){
                        if (neighbors.isMine)
                            gameField[y][x].countMineNeighbors++;
                    }
                }
            }
        }
    }
    
    private void openTile(int x, int y){
        if (gameField[y][x].isOpen || gameField[y][x].isFlag || isGameStopped)
            return;
        else    
            gameField[y][x].isOpen = true;
            countClosedTiles--;
        if (gameField[y][x].isMine){
            setCellValueEx(x, y, Color.RED, MINE);
            gameOver();
        }    
        else {
            score += 5;
            setScore(score);
            if (gameField[y][x].countMineNeighbors != 0){
                setCellNumber(x, y, gameField[y][x].countMineNeighbors);
            }    
            else{
                setCellValue(x, y, "");
                for (GameObject neighbors : getNeighbors(gameField[y][x])){
                    if (!neighbors.isOpen){
                        openTile(neighbors.x, neighbors.y);
                    }    
                }        
            }    
            setCellColor(x, y, Color.GREEN);
            if (countClosedTiles == countMinesOnField)
                win();
        }    
    }
    
    private void markTile(int x, int y){
        if (isGameStopped)
            return;
        if (!gameField[y][x].isOpen){
            if (!gameField[y][x].isFlag && countFlags !=0){
                gameField[y][x].isFlag = true;
                countFlags--;
                setCellValue(x, y, FLAG);
                setCellColor(x, y, Color.YELLOW);
            }
            else if(gameField[y][x].isFlag){
                gameField[y][x].isFlag = false;
                countFlags++;
                setCellValue(x, y, "");
                setCellColor(x, y, Color.ORANGE);
            }
        }
    }
    
    private void gameOver(){
        isGameStopped = true;
        showMessageDialog(Color.RED, "WASTED", Color.WHITE, 80);
    }
    
    private void win(){
        isGameStopped = true;
        showMessageDialog(Color.GREEN, "КРАСАВЧЕГ!", Color.WHITE, 80);
    }
    
    private void restart(){
        isGameStopped = false;
        countClosedTiles = SIDE*SIDE;
        score = 0;
        countMinesOnField = 0;
        setScore(score);
        createGame();
    }
}


public class GameObject {
    public int x;
    public int y;
    public boolean isMine;
    public int countMineNeighbors;
    public boolean isOpen;
    public boolean isFlag;

    public GameObject(int x, int y, boolean isMine){
        this.x = x;
        this.y = y;
        this.isMine = isMine;
    }
}

