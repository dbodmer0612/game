package model;

public class SegmentImpl implements Segment {
  int x;
  int y;
  Direction direction;

  public SegmentImpl() {

  }

  public SegmentImpl(int x, int y, Direction direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public SegmentImpl(int x, int y) {
    this.x = x;
    this.y = y;
    this.direction = Direction.RIGHT;
  }

  @Override
  public void setX(int x) {
    this.x = x;
  }

  @Override
  public void setY(int y) {
    this.y = y;
  }

  @Override
  public int getX() {
    return this.x;
  }

  @Override
  public int getY() {
    return this.y;
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
  public void setDirection(Direction d) {
    this.direction = d;
  }

  @Override
  public void update() {
    if(this.direction == Direction.RIGHT) {
      this.x++;
    }
    if(this.direction == Direction.LEFT) {
      this.x--;
    }
    if(this.direction == Direction.UP) {
      this.y++;
    }
    if(this.direction == Direction.DOWN) {
      this.y--;
    }
  }

  @Override
  public Direction getDirection() {
    return direction;
  }

  enum Direction {
    UP, DOWN, LEFT, RIGHT
  }
}
