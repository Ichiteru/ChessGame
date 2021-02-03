package entity;

import chessboard.Board;
import chessboard.Coordinate;

import java.util.ArrayList;

public class Pawn extends Figure {

    public Pawn(char icon, String team) {
        super(icon, team);
    }

    @Override
    public void fullPositionsToMove(Board board, Coordinate startPosition) {
        int positionNumber = 0;
        int nomineePosition = 0;
        for (int i = 0; i < 64; i++) {
            if (board.getPositions()[i].equals(startPosition)){
                positionNumber = i;
                break;
            }
        }
        nomineePosition = positionNumber;
        if (startPosition.getFigure().getTeam() == "white" && nomineePosition > 7){
            if (board.getPositions()[nomineePosition - 8].getFigure() == null)
                getMoveOptions().add(board.getPositions()[nomineePosition - 8]);
            if (board.getPositions()[nomineePosition - 7].getFigure() != null){
                if (board.getPositions()[nomineePosition - 7].getFigure().getTeam() != this.getTeam()){
                    getMoveOptions().add(board.getPositions()[nomineePosition + 7]);
                }
            }
            if (board.getPositions()[nomineePosition - 9].getFigure() != null){
                if (board.getPositions()[nomineePosition - 9].getFigure().getTeam() != this.getTeam()){
                    getMoveOptions().add(board.getPositions()[nomineePosition + 9]);
                }
            }
        }
        if (startPosition.getFigure().getTeam() == "black" && nomineePosition < 56){
            if (board.getPositions()[nomineePosition + 8].getFigure() == null)
                getMoveOptions().add(board.getPositions()[nomineePosition + 8]);
            if (board.getPositions()[nomineePosition + 7].getFigure() != null){
                if (board.getPositions()[nomineePosition + 7].getFigure().getTeam() != this.getTeam()){
                   getMoveOptions().add(board.getPositions()[nomineePosition + 7]);
                }
            }
            if (board.getPositions()[nomineePosition + 9].getFigure() != null){
                if (board.getPositions()[nomineePosition + 9].getFigure().getTeam() != this.getTeam()){
                    getMoveOptions().add(board.getPositions()[nomineePosition + 9]);
                }
            }
        }
    }
}
