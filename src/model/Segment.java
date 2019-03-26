package model;

public interface Segment {

  void setX(int x);
  void setY(int y);
  int getX();
  int getY();
  void turnRight();
  void turnLeft();
  void turnUp();
  void turnDown();
  void setDirection(SegmentImpl.Direction d);
  void update();
  SegmentImpl.Direction getDirection();

}
