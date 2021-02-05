package entity;

import chessboard.Board;
import chessboard.Coordinate;
import service.HorseMoveController;

import java.util.ArrayList;

public class Horse extends Figure {

    public Horse(char icon, String team) {
        super(icon, team);
    }

    @Override
    public void fullPositionsToMove(Board board, Coordinate startPosition) {
        getMoveOptions().clear();
        int positionNumber = 0;
        int nomineePosition = 0;
        for (int i = 0; i < 64; i++) {
            if (board.getPositions()[i].equals(startPosition)){
                positionNumber = i;
                break;
            }
        }
        nomineePosition = positionNumber - 10;
        if (nomineePosition >=0 && HorseMoveController.checkFigureMove(startPosition,
                board.getPositions()[nomineePosition])) {
            if (board.getPositions()[nomineePosition].getFigure() == null)
                getMoveOptions().add(board.getPositions()[nomineePosition]);
            if (board.getPositions()[nomineePosition].getFigure() != null) {
                if (board.getPositions()[nomineePosition].getFigure().getTeam() != this.getTeam())
                    getMoveOptions().add(board.getPositions()[nomineePosition]);
            }
        }
        nomineePosition = positionNumber - 17;
        if (nomineePosition >=0 && HorseMoveController.checkFigureMove(startPosition,
                board.getPositions()[nomineePosition])) {
            if (board.getPositions()[nomineePosition].getFigure() == null)
                getMoveOptions().add(board.getPositions()[nomineePosition]);
            if (board.getPositions()[nomineePosition].getFigure() != null) {
                if (board.getPositions()[nomineePosition].getFigure().getTeam() != this.getTeam())
                    getMoveOptions().add(board.getPositions()[nomineePosition]);
            }
        }
        nomineePosition = positionNumber - 6;
        if (nomineePosition >=0 && HorseMoveController.checkFigureMove(startPosition,
                board.getPositions()[nomineePosition])) {
            if (board.getPositions()[nomineePosition].getFigure() == null)
                getMoveOptions().add(board.getPositions()[nomineePosition]);
            if (board.getPositions()[nomineePosition].getFigure() != null) {
                if (board.getPositions()[nomineePosition].getFigure().getTeam() != this.getTeam())
                    getMoveOptions().add(board.getPositions()[nomineePosition]);
            }
        }
        nomineePosition = positionNumber + 10;
        if (nomineePosition < 64 && HorseMoveController.checkFigureMove(startPosition,
                board.getPositions()[nomineePosition])) {
            if (board.getPositions()[nomineePosition].getFigure() == null)
                getMoveOptions().add(board.getPositions()[nomineePosition]);
            if (board.getPositions()[nomineePosition].getFigure() != null) {
                if (board.getPositions()[nomineePosition].getFigure().getTeam() != this.getTeam())
                    getMoveOptions().add(board.getPositions()[nomineePosition]);
            }
        }
        nomineePosition = positionNumber + 17;
        if (nomineePosition < 64 && HorseMoveController.checkFigureMove(startPosition,
                board.getPositions()[nomineePosition])) {
            if (board.getPositions()[nomineePosition].getFigure() == null)
                getMoveOptions().add(board.getPositions()[nomineePosition]);
            if (board.getPositions()[nomineePosition].getFigure() != null) {
                if (board.getPositions()[nomineePosition].getFigure().getTeam() != this.getTeam())
                    getMoveOptions().add(board.getPositions()[nomineePosition]);
            }
        }
        nomineePosition = positionNumber + 15;
        if (nomineePosition < 64 && HorseMoveController.checkFigureMove(startPosition,
                board.getPositions()[nomineePosition])) {
            if (board.getPositions()[nomineePosition].getFigure() == null)
                getMoveOptions().add(board.getPositions()[nomineePosition]);
            if (board.getPositions()[nomineePosition].getFigure() != null) {
                if (board.getPositions()[nomineePosition].getFigure().getTeam() != this.getTeam())
                    getMoveOptions().add(board.getPositions()[nomineePosition]);
            }
        }
        nomineePosition = positionNumber + 6;
        if (nomineePosition < 64 && HorseMoveController.checkFigureMove(startPosition,
                board.getPositions()[nomineePosition])) {
            if (board.getPositions()[nomineePosition].getFigure() == null)
                getMoveOptions().add(board.getPositions()[nomineePosition]);
            if (board.getPositions()[nomineePosition].getFigure() != null) {
                if (board.getPositions()[nomineePosition].getFigure().getTeam() != this.getTeam())
                    getMoveOptions().add(board.getPositions()[nomineePosition]);
            }
        }
    }
}
