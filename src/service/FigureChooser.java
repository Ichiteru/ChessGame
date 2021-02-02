package service;

import chessboard.Board;
import chessboard.Coordinate;
import entity.Figure;
import entity.Player;

public class FigureChooser {

    static public Figure getFigureByCoordinate(Board board, Coordinate position){
        for (Coordinate boardPosition :
                board.getPositions()) {
            if (boardPosition.getDigit() == position.getDigit()
                    && boardPosition.getLetter() == position.getLetter()
                    ) {
                return boardPosition.getFigure();
            }
        }
        return null;
    }

}
