package entity;

import chessboard.Board;
import chessboard.Coordinate;

import java.util.ArrayList;

public class Horse extends Figure {

    public Horse(char icon, String team) {
        super(icon, team);
    }

    @Override
    public void fullPositionsToMove(Board board, Coordinate position) {

    }
}
