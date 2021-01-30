package service;

import chessboard.Board;
import entity.Player;

public class GameStarter {

    public void start(){
        GraphicPainter graphicPainter = new GraphicPainter();
        Board board = new Board();
        Player first = new Player("white", "Nickname_1");
        Player second = new Player("black", "Nickname_2");
        ChessPuller.distributeChess(first, second, board);
        graphicPainter.display(board);
    }

}
