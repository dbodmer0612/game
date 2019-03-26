package model;

public class SegmentImpl implements Segment {
  private int x;
  private int y;
  private Direction direction;
  private boolean isTail;

  public SegmentImpl() {

  }

  public SegmentImpl(int x, int y, Direction direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public SegmentImpl(int x, int y, Direction direction, boolean isTail) {
    this.x = x;
    this.y = y;
    this.direction = direction;
    this.isTail = isTail;
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
  public boolean isTail() {
    return this.isTail;
  }

  @Override
  public void setTail(boolean tail) {
    this.isTail = tail;
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
