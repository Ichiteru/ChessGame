package entity;

import chessboard.Board;
import chessboard.Coordinate;
import service.Moveable;

import java.util.ArrayList;
import java.util.List;

public class Elephant extends Figure implements Moveable {

    public Elephant(char icon, String team) {
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
        nomineePosition = positionNumber - 9;
        while (nomineePosition >=0 && nomineePosition < 64){
            if (board.getPositions()[nomineePosition].getLetter() == 'H') break;
            if (board.getPositions()[nomineePosition].getFigure() != null) {
                if (board.getPositions()[nomineePosition].getFigure().getTeam() == this.getTeam()){
                    break;
                }
                if (board.getPositions()[nomineePosition].getFigure().getTeam() != this.getTeam()){
                    getMoveOptions().add(board.getPositions()[nomineePosition]);
                    break;
                }
            } if (board.getPositions()[nomineePosition].getFigure() == null) { // if == null ?
                getMoveOptions().add(board.getPositions()[nomineePosition]);
                nomineePosition -= 9;
            }
        }
        nomineePosition = positionNumber + 9;
        while (nomineePosition >=0 && nomineePosition < 64){
            if (board.getPositions()[nomineePosition].getLetter() == 'A') break;
            if (board.getPositions()[nomineePosition].getFigure() != null) {
                if (board.getPositions()[nomineePosition].getFigure().getTeam() == this.getTeam()){
                    break;
                }
                if (board.getPositions()[nomineePosition].getFigure().getTeam() != this.getTeam()){
                    getMoveOptions().add(board.getPositions()[nomineePosition]);
                    break;
                }
            } else {
                getMoveOptions().add(board.getPositions()[nomineePosition]);
                nomineePosition += 9;
            }
        }
        nomineePosition = positionNumber - 7; // правильный вариант
        while (nomineePosition >=0 && nomineePosition < 64){
            if (board.getPositions()[nomineePosition].getLetter() == 'A') break;
            if (board.getPositions()[nomineePosition].getFigure() != null) {
                if (board.getPositions()[nomineePosition].getFigure().getTeam() == this.getTeam()){
                    break;
                }
                if (board.getPositions()[nomineePosition].getFigure().getTeam() != this.getTeam()){
                    getMoveOptions().add(board.getPositions()[nomineePosition]);
                    break;
                }
            } else {
                getMoveOptions().add(board.getPositions()[nomineePosition]);
                nomineePosition -= 7;
            }
        }
        nomineePosition = positionNumber + 7;
        while (nomineePosition >=0 && nomineePosition < 64){
            if (board.getPositions()[nomineePosition].getLetter() == 'H') break;
            if (board.getPositions()[nomineePosition].getFigure() != null) {
                if (board.getPositions()[nomineePosition].getFigure().getTeam() == this.getTeam()){
                    break;
                }
                if (board.getPositions()[nomineePosition].getFigure().getTeam() != this.getTeam()){
                    getMoveOptions().add(board.getPositions()[nomineePosition]);
                    break;
                }
            } else {
                getMoveOptions().add(board.getPositions()[nomineePosition]);
                nomineePosition += 7;
            }
        }

    }
}
