package model;

import sun.tools.jconsole.ProxyClient;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SnakeImpl implements Snake {
  private List<Segment> body;
  private List<Segment> turningPoints;
  private Segment head;


  public SnakeImpl() {
    this.body = new ArrayList<>();
    this.turningPoints = new ArrayList<>();
  }

  public SnakeImpl(Segment head) {
    this.head = head;
  }

  @Override
  public void addLength() {
    Segment tail = this.body.get(this.body.size() - 1);
    tail.setTail(false);
    if(tail.getDirection() == SegmentImpl.Direction.RIGHT) {
      this.body.add(new SegmentImpl(tail.getX() - 1, tail.getY(), SegmentImpl.Direction.RIGHT, true));
    }
    if(tail.getDirection() == SegmentImpl.Direction.LEFT) {
      this.body.add(new SegmentImpl(tail.getX() + 1, tail.getY(), SegmentImpl.Direction.LEFT, true));
    }
    if(tail.getDirection() == SegmentImpl.Direction.UP) {
      this.body.add(new SegmentImpl(tail.getX(), tail.getY() + 1, SegmentImpl.Direction.UP, true));
    }
    if(tail.getDirection() == SegmentImpl.Direction.DOWN) {
      this.body.add(new SegmentImpl(tail.getX(), tail.getY() - 1, SegmentImpl.Direction.DOWN, true));
    }
  }

  @Override
  public void updateSnake() {
    for (Segment s : body) {
      s.update();
      for (Segment turn : this.turningPoints) {
        if (turn.getX() == s.getX() && turn.getY() == s.getY()) {
          s.setDirection(turn.getDirection());
          if (s.isTail()) {
            this.turningPoints.remove(turn);
          }
        }
      }
    }
  }

  @Override
  public List<Segment> getBody() {
    return body;
  }

  @Override
  public boolean collision() {
    for (Segment s : this.body) {
      if (this.head.getX() == s.getX() && this.head.getY() == s.getY()) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void turn(SegmentImpl.Direction direction) {
    if (this.head.getDirection() != getOpposite(direction)) {
      this.head.setDirection(direction);
      this.turningPoints.add(new SegmentImpl(this.head.getX(), this.head.getY(), direction));
    }
  }

  private static SegmentImpl.Direction getOpposite(SegmentImpl.Direction direction) {
    switch (direction) {
      case LEFT:
        return SegmentImpl.Direction.RIGHT;
      case RIGHT:
        return SegmentImpl.Direction.LEFT;
      case UP:
        return SegmentImpl.Direction.DOWN;
      case DOWN:
        return SegmentImpl.Direction.UP;
        default:
          throw new IllegalArgumentException("idk how you got here tbh");
    }
  }


}
