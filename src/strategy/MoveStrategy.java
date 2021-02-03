package strategy;

import chessboard.Board;
import chessboard.Coordinate;
import entity.Figure;
import entity.Player;

public class MoveStrategy {

     static public void setMoveOptions(Board board){
        for (Coordinate position :
                board.getPositions()) {
            if (position.getFigure() != null){
                 position.getFigure().fullPositionsToMove(board, position);
            }
        }
    }

    static public boolean isPositionCorrespond(Coordinate position, Figure figure){
        for (Coordinate figureMoveOption : figure.getMoveOptions()){
            if (position.getDigit() == figureMoveOption.getDigit()
                    && position.getLetter() == figureMoveOption.getLetter()) return true;
        }
        return false;
    }


}
