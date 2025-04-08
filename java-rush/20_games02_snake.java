package com.javarush.games.snake;

import com.javarush.engine.cell.*;

public class SnakeGame extends Game {

    public static final int WIDTH = 15;
    public static final int HEIGHT = 15;
    private static final int GOAL = 28;
    private int turnDelay;
    private Snake snake;
    private Apple apple;
    private boolean isGameStopped;
    private int score;

    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }
    
    @Override
    public void onTurn(int step){
        snake.move(apple);
        if(apple.isAlive == false) {
            createNewApple();
            score += 5;
            setScore(score);
            turnDelay -= 10;
            setTurnTimer(turnDelay);
        }
        if (snake.isAlive == false)
            gameOver();
        if (snake.getLength() > GOAL)
            win();
        drawScene();
    }
    
    @Override
    public void onKeyPress(Key key){
        if (key == Key.LEFT)
            snake.setDirection(Direction.LEFT);
        if (key == Key.RIGHT)
            snake.setDirection(Direction.RIGHT);
        if (key == Key.UP)
            snake.setDirection(Direction.UP);
        if (key == Key.DOWN)
            snake.setDirection(Direction.DOWN);
        if ((key == Key.SPACE)  && isGameStopped)
            createGame();
    }


    private void createGame(){
        isGameStopped = false;
        score = 0;
        setScore(score);
        snake = new Snake(WIDTH/2, HEIGHT/2);
        createNewApple();
        drawScene();
        turnDelay = 300;
        setTurnTimer(turnDelay);
    }
    
    private void createNewApple(){
        apple = new Apple(getRandomNumber(WIDTH),getRandomNumber(HEIGHT));
        while (snake.checkCollision(apple)) {
            apple = new Apple(getRandomNumber(WIDTH), getRandomNumber(HEIGHT));
        }
    }

    private void drawScene(){
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                setCellValueEx(i, j, Color.DARKSEAGREEN, "");
            }
        }
        snake.draw(this);
        apple.draw(this);
    }

    private void gameOver(){
        stopTurnTimer();
        isGameStopped = true;
        showMessageDialog(Color.WHITE, "GAME OVER", Color.RED, 80);
    }

    private void win(){
        stopTurnTimer();
        isGameStopped = true;
        showMessageDialog(Color.WHITE, "YOU WIN", Color.GREEN, 80);
    }
    
}

package com.javarush.games.snake;

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class Snake {

    private final static String HEAD_SIGN = "\uD83D\uDC7E";
    private final static String BODY_SIGN = "\u26AB";
    public boolean isAlive = true;
    private Direction direction = Direction.LEFT;

    private List<GameObject> snakeParts = new ArrayList<>();
    
    public void setDirection(Direction direction){
        if (((direction == Direction.RIGHT) && (this.direction != Direction.LEFT) && (snakeParts.get(0).x == snakeParts.get(1).x))||
            ((direction == Direction.LEFT) && (this.direction != Direction.RIGHT) && (snakeParts.get(0).x == snakeParts.get(1).x))||
            ((direction == Direction.UP) && (this.direction != Direction.DOWN) && (snakeParts.get(0).y == snakeParts.get(1).y))||
            ((direction == Direction.DOWN) && (this.direction != Direction.UP) && (snakeParts.get(0).y == snakeParts.get(1).y)))
            this.direction = direction;
    }

    public Snake(int x, int y) {
        snakeParts.add(new GameObject(x, y));
        snakeParts.add(new GameObject(x + 1, y));
        snakeParts.add(new GameObject(x + 2, y));
    }

    public void draw(Game game) {
        for (int i = 0; i < snakeParts.size(); i++) {
            GameObject part = snakeParts.get(i);
            String sign = (i != 0) ? BODY_SIGN : HEAD_SIGN;
            if (isAlive)
                game.setCellValueEx(part.x, part.y, Color.NONE, sign, Color.BLACK, 75);
            else
                game.setCellValueEx(part.x, part.y, Color.NONE, sign, Color.RED, 75);
        }
    }
    
    public GameObject createNewHead(){
        int headX = snakeParts.get(0).x;
        int headY = snakeParts.get(0).y;
        if (direction == Direction.LEFT)
            return new GameObject(headX-1, headY);
        else if (direction == Direction.RIGHT)
            return new GameObject(headX+1, headY);
        else if (direction == Direction.UP)
            return new GameObject(headX, headY-1);
        else
            return new GameObject(headX, headY+1);
    }
    
    public void removeTail(){
        snakeParts.remove(snakeParts.size()-1);
    }
    
    public void move(Apple apple){
        GameObject temp = createNewHead();
        if(checkCollision(temp)){
            isAlive = false;
        }    
        else{    
            if (temp.x >= 0 && temp.y >= 0 && temp.x < 15 && temp.y < 15){
                snakeParts.add(0, temp);
                if ((temp.x == apple.x) && (temp.y == apple.y)){
                    apple.isAlive = false;
                }
                else{
                    removeTail();
                }    
            }    
            else
                isAlive = false;
        }        
    }
    
    public boolean checkCollision(GameObject head){
        for (int i = 0; i < snakeParts.size(); i++) {
            if ((head.x == snakeParts.get(i).x) && (head.y == snakeParts.get(i).y))
                return true;
        }
        return false;
    }

    public int getLength(){
        return snakeParts.size();
    }
}

package com.javarush.games.snake;

import com.javarush.engine.cell.*;

public class Apple extends GameObject {

    private static final String APPLE_SIGN = "\uD83C\uDF4E";
    public boolean isAlive = true;

    public Apple(int x, int y) {
        super(x, y);
    }

    public void draw(Game game) {
        game.setCellValueEx(x, y, Color.NONE, APPLE_SIGN, Color.GREEN, 75);
    }
}

package com.javarush.games.snake;

public class GameObject {

    public int x;
    public int y;

    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

package com.javarush.games.snake;


public enum Direction {
    UP,
    RIGHT,
    DOWN,
    LEFT
}
