package service;

import chessboard.Board;
import chessboard.Coordinate;
import entity.Figure;

public interface Changeable {

        public void change(Figure figure, Coordinate start, Coordinate end);
}
