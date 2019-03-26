package model;

public interface Segment {

  void setX(int x);
  void setY(int y);
  int getX();
  int getY();
  boolean isTail();
  void setTail(boolean tail);
  void setDirection(SegmentImpl.Direction d);
  void update();
  SegmentImpl.Direction getDirection();

}
