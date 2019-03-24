package model;

public interface Snake {

    void addLength();
    void updateSnake();
    Position getPosition();
    boolean collision();
    void turnRight();
    void turnLeft();
    void turnUp();
    void turnDown();
    SnakeImpl.Direction getDirection();





}
