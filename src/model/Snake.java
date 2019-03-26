package model;

import java.util.List;

public interface Snake {

    void addLength();
    void updateSnake();
    List<Segment> getBody();
    boolean collision();
    void turn(SegmentImpl.Direction direction);
}
