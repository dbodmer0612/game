package model;

import java.awt.*;

public class SnakeImpl implements Snake {
  private int length;
  List position;
  Direction direction;

  @Override
  public void addLength() {
    length++;
  }

  @Override
  public void updateSnake() {

  }

  @Override
  public Position getPosition() {
    return position;
  }

  @Override
  public boolean collision() {
    return false;
  }

  @Override
  public void turnRight() {
    direction = Direction.RIGHT;
  }

  @Override
  public void turnLeft() {
    direction = Direction.LEFT;
  }

  @Override
  public void turnUp() {
    direction = Direction.UP;
  }

  @Override
  public void turnDown() {
    direction = Direction.DOWN;
  }

  @Override
  public Direction getDirection() {
    return direction;
  }

  enum Direction {
    UP, DOWN, LEFT, RIGHT
  }








}
