/* На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y. Ось X смотрит слева направо, ось Y — снизу вверх. (Помните, как рисовали графики функций в школе?)
В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит: вверх, вниз, направо или налево. Ваша задача — привести робота в заданную точку игрового поля.
Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):
public class Robot {
    public Direction getDirection() {
        // текущее направление взгляда
    }
    public int getX() {
        // текущая координата X
    }
    public int getY() {
        // текущая координата Y
    }
    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
    }
    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
    }
    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }
}
Direction, направление взгляда робота,  — это перечисление:
public enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}
Пример
В метод передано: toX == 3, toY == 0; начальное состояние робота такое: robot.getX() == 0, robot.getY() == 0, robot.getDirection() == Direction.UP
Чтобы привести робота в указанную точку (3, 0), метод должен вызвать у робота следующие методы:
robot.turnRight();
robot.stepForward();
robot.stepForward();
robot.stepForward(); */


import java.math.*;
import java.util.Arrays;

public class robot {
    public static void main(String[] args) {
        Robot robot = new Robot(0,0, Direction.DOWN);
        moveRobot(robot, -20, 30);
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot (int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {return dir;}

        public int getX() {return x;}

        public int getY() {return y;}

        public void turnLeft() {
            if      (dir == Direction.UP)    {dir = Direction.LEFT;}
            else if (dir == Direction.DOWN)  {dir = Direction.RIGHT;}
            else if (dir == Direction.LEFT)  {dir = Direction.DOWN;}
            else if (dir == Direction.RIGHT) {dir = Direction.UP;}
        }

        public void turnRight() {
            if      (dir == Direction.UP)    {dir = Direction.RIGHT;}
            else if (dir == Direction.DOWN)  {dir = Direction.LEFT;}
            else if (dir == Direction.LEFT)  {dir = Direction.UP;}
            else if (dir == Direction.RIGHT) {dir = Direction.DOWN;}
        }

        public void stepForward() {
            if (dir == Direction.UP)    {y++;}
            if (dir == Direction.DOWN)  {y--;}
            if (dir == Direction.LEFT)  {x--;}
            if (dir == Direction.RIGHT) {x++;}
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        boolean direct = false;
        int fromX = robot.getX();
        int fromY = robot.getY();
        System.out.println("Координаты до движения: X = " + robot.getX() + " Y = " + robot.getY());

        // Движение по горизонтали до toX

        // Если цель слева, поворот в левую сторону
        if ((fromX - toX) > 0) {
            while (!robot.getDirection().equals(Direction.LEFT))
                robot.turnLeft();
            direct = true;
        }
        // Если цель справа, поворот в правую сторону
        else {
            if ((fromX - toX) < 0) {
                while (!robot.getDirection().equals(Direction.RIGHT))
                    robot.turnRight();
                direct = true;
            }
        }
        // Движение до toX
        while (robot.getX() != toX)
            robot.stepForward();
        direct = false;

        System.out.println("Координаты после движения по горизонтали: X = " + robot.getX() + " Y = " + robot.getY());

        // Движение по вертикали до toY

        // Если цель снизу, поворот в нижнюю сторону
        if ((fromY - toY) > 0) {
            while (!robot.getDirection().equals(Direction.DOWN))
                robot.turnLeft();
            direct = true;
        }
        // Если цель сверху, поворот в верхнюю сторону
        else {
            if ((fromY - toY) < 0) {
                while (!robot.getDirection().equals(Direction.UP))
                    robot.turnRight();
                direct = true;
            }
        }

        // Движение до toY
        while (robot.getY() != toY)
            robot.stepForward();
        direct = false;

        System.out.println("Координаты после движения по вертикали: X = " + robot.getX() + " Y = " + robot.getY());

    }
}
