package service;

import chessboard.Board;
import entity.Player;

public interface GameProcess {

    public String gameProcess(Player player1, Player player2, Board board, GraphicPainter graphicPainter);
}
