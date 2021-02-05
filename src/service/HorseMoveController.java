package service;

import chessboard.Coordinate;

public class HorseMoveController {

    static public boolean checkFigureMove(Coordinate start, Coordinate end) {
        if ( (Math.abs( Character.getNumericValue(start.getLetter()) - Character.getNumericValue(end.getLetter())) == 1
                && Math.abs( Character.getNumericValue(start.getDigit()) - Character.getNumericValue(end.getDigit())) == 2)
                || (Math.abs( Character.getNumericValue(start.getLetter()) - Character.getNumericValue(end.getLetter())) == 2
                && Math.abs( Character.getNumericValue(start.getDigit()) - Character.getNumericValue(end.getDigit())) == 1) ){
            return true;
        }
        return false;
    }
}
