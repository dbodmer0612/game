package model;

import java.awt.*;
import java.util.List;

public class SnakeImpl implements Snake {
  private List<Segment> body;
  private List<Point> turningPoints;
  private Segment head;
  private Segment tail;


  public SnakeImpl() {
  }

  public SnakeImpl(Segment head) {
    this.head = head;
  }

  @Override
  public void addLength() {
    body.add(new SegmentImpl());
  }

  @Override
  public void updateSnake() {
    for (Segment s : body) {
//      need to figure out how to make the snake turn correctly
      s.update();
    }
  }

  @Override
  public List<Segment> getBody() {
    return body;
  }

  @Override
  public boolean collision() {
    return false;
  }

  @Override
  public void turn(SegmentImpl.Direction direction) {
    if(!isOpposite(direction)) {
      this.head.setDirection(direction);
    }
  }

  private boolean isOpposite(SegmentImpl.Direction direction) {
    switch (direction) {
      case LEFT:
        if(this.head.getDirection() == SegmentImpl.Direction.RIGHT) {
          return true;
        }
      case RIGHT:
        if(this.head.getDirection() == SegmentImpl.Direction.LEFT) {
          return true;
        }
      case UP:
        if(this.head.getDirection() == SegmentImpl.Direction.DOWN) {
          return true;
        }
      case DOWN:
        if(this.head.getDirection() == SegmentImpl.Direction.UP) {
          return true;
        }
    }
    return false;
  }


}
