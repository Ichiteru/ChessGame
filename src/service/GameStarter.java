package service;

import chessboard.Board;
import entity.Player;

public class GameStarter implements GameProcess {

    public void start(){
        GraphicPainter graphicPainter = new GraphicPainter();
        Board board = new Board();
        Player first = new Player("white", "Nickname_1");
        Player second = new Player("black", "Nickname_2");
        ChessPuller.distributeChess(first, second, board);
        graphicPainter.display(board);
        while (true){
            gameProcess(first, second, board, graphicPainter);
        }
    }

    @Override
    public String gameProcess(Player player1, Player player2, Board board, GraphicPainter graphicPainter) {
        player1.moveFigure(board);
        graphicPainter.display(board);
        player2.moveFigure(board);
        graphicPainter.display(board);
        // ход белых
        // ход черных
        // возврат white, black, none
        return null;

    }
}
