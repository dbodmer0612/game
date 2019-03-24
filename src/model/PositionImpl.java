package model;

public class PositionImpl implements Position {
  int x;
  int y;

  public PositionImpl() {

  }

  public PositionImpl(int x, int y) {
    this.x = x;
    this.y = y;
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
}
