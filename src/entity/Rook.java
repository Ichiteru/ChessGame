package entity;

import chessboard.Board;
import chessboard.Coordinate;

import java.util.ArrayList;

public class Rook extends Figure{

    public Rook(char icon, String team) {
        super(icon, team);
    }

    @Override
    public void fullPositionsToMove(Board board, Coordinate position) {

    }
}
