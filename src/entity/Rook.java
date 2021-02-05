package entity;

import chessboard.Board;
import chessboard.Coordinate;

import java.util.ArrayList;

public class Rook extends Figure{

    public Rook(char icon, String team) {
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
        nomineePosition = positionNumber - 1;
        while (nomineePosition >= 0) {
            if (board.getPositions()[nomineePosition].getLetter() != 'H'){
                if (board.getPositions()[nomineePosition].getLetter() == 'H')
                    break;
                if (board.getPositions()[nomineePosition].getFigure() == null){
                    getMoveOptions().add(board.getPositions()[nomineePosition--]);
                    continue;
                }
                if (board.getPositions()[nomineePosition].getFigure() != null){
                    if (board.getPositions()[nomineePosition].getFigure().getTeam() != this.getTeam())
                        getMoveOptions().add(board.getPositions()[nomineePosition]);
                    break;
                }
            } else break;
        }
        nomineePosition = positionNumber + 1;
        while (nomineePosition < 64) {
            if (board.getPositions()[nomineePosition].getLetter() != 'H'){
                if (board.getPositions()[nomineePosition].getLetter() == 'H')
                    break;
                if (board.getPositions()[nomineePosition].getFigure() == null){
                    getMoveOptions().add(board.getPositions()[nomineePosition++]);
                    continue;
                }
                if (board.getPositions()[nomineePosition].getFigure() != null){
                    if (board.getPositions()[nomineePosition].getFigure().getTeam() != this.getTeam())
                        getMoveOptions().add(board.getPositions()[nomineePosition]);
                    break;
                }
            } else break;
        }
        nomineePosition = positionNumber - 8;
        while (nomineePosition >= 0){
            if (board.getPositions()[nomineePosition].getFigure() == null){
                getMoveOptions().add(board.getPositions()[nomineePosition]);
                nomineePosition -= 8;
                continue;
            }
            if (board.getPositions()[nomineePosition].getFigure() != null){
                if (board.getPositions()[nomineePosition].getFigure().getTeam() != this.getTeam())
                    getMoveOptions().add(board.getPositions()[nomineePosition]);
                break;
            }
        }
        nomineePosition = positionNumber + 8;
        while (nomineePosition < 64){
            if (board.getPositions()[nomineePosition].getFigure() == null) {
                getMoveOptions().add(board.getPositions()[nomineePosition]);
                nomineePosition += 8;
                continue;
            }
            if (board.getPositions()[nomineePosition].getFigure() != null){
                if (board.getPositions()[nomineePosition].getFigure().getTeam() != this.getTeam())
                    getMoveOptions().add(board.getPositions()[nomineePosition]);
                break;
            }
        }
    }
}
