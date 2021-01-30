package service;

import chessboard.Board;

public class GraphicPainter {

     public void display(Board board){
        int pos = 0;
        System.out.print("  _ _ _ _ _ _ _ _\n");
        for (int i = 8; i > 0; i--) {
            System.out.print(i + "|");
            for (int j = 0; j < 8; j++) {
                if (board.getPositions()[pos].getFigure() != null){
                    System.out.print(board.getPositions()[pos++].getFigure().getIcon() + "|");
                } else {
                    System.out.print(" |");
                    pos++;
                }
            }
            System.out.print("\n  _ _ _ _ _ _ _ _\n");
        }
        System.out.print("  A B C D E F G H\n");
    }

}
