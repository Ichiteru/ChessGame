package service;

import chessboard.Board;
import chessboard.Coordinate;

public interface Moveable {

    public void fullPositionsToMove(Board board, Coordinate startPosition);
}
