package service;

import chessboard.Board;
import entity.Player;

public class ChessPuller {

     static void distributeChess(Player player1, Player player2, Board board) {
        if (player1.getTeam().equals("white")) {
            for (int i = 48; i < 64; i++) {
                player1.getFigures().add(board.getPositions()[i].getFigure());
            }
            for (int i = 0; i < 16; i++) {
                player2.getFigures().add(board.getPositions()[i].getFigure());
            }
        } else {
            for (int i = 48; i < 64; i++) {
                player2.getFigures().add(board.getPositions()[i].getFigure());
            }
            for (int i = 0; i < 16; i++) {
                player1.getFigures().add(board.getPositions()[i].getFigure());
            }
        }

    }
}