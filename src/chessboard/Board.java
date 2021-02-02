package chessboard;

import entity.*;
import service.Changeable;

public class Board implements Changeable {

    private Coordinate positions[] = new Coordinate[64];

    public Board() {
        this.positions[0] = new Coordinate('8', 'A', new Rook('r', "black"));
        this.positions[1] = new Coordinate('8', 'B', new Horse('h', "black"));
        this.positions[2] = new Coordinate('8', 'C', new Elephant('e', "black"));
        this.positions[3] = new Coordinate('8', 'D', new King('k', "black"));
        this.positions[4] = new Coordinate('8', 'E', new Queen('q', "black"));
        this.positions[5] = new Coordinate('8', 'F', new Elephant('e', "black"));
        this.positions[6] = new Coordinate('8', 'G', new Horse('h', "black"));
        this.positions[7] = new Coordinate('8', 'H', new Rook('r', "black"));
        this.positions[8] = new Coordinate('7', 'A', new Pawn('p', "black"));
        this.positions[9] = new Coordinate('7', 'B', new Pawn('p', "black"));
        this.positions[10] = new Coordinate('7', 'C', new Pawn('p', "black"));
        this.positions[11] = new Coordinate('7', 'D', new Pawn('p', "black"));
        this.positions[12] = new Coordinate('7', 'E', new Pawn('p', "black"));
        this.positions[13] = new Coordinate('7', 'F', new Pawn('p', "black"));
        this.positions[14] = new Coordinate('7', 'G', new Pawn('p', "black"));
        this.positions[15] = new Coordinate('7', 'H', new Pawn('p', "black"));

        this.positions[16] = new Coordinate('6', 'A');
        this.positions[17] = new Coordinate('6', 'B');
        this.positions[18] = new Coordinate('6', 'C');
        this.positions[19] = new Coordinate('6', 'D');
        this.positions[20] = new Coordinate('6', 'E');
        this.positions[21] = new Coordinate('6', 'F');
        this.positions[22] = new Coordinate('6', 'G');
        this.positions[23] = new Coordinate('6', 'H');

        this.positions[24] = new Coordinate('5', 'A');
        this.positions[25] = new Coordinate('5', 'B');
        this.positions[26] = new Coordinate('5', 'C');
        this.positions[27] = new Coordinate('5', 'D');
        this.positions[28] = new Coordinate('5', 'E');
        this.positions[29] = new Coordinate('5', 'F');
        this.positions[30] = new Coordinate('5', 'G');
        this.positions[31] = new Coordinate('5', 'H');

        this.positions[32] = new Coordinate('4', 'A');
        this.positions[33] = new Coordinate('4', 'B');
        this.positions[34] = new Coordinate('4', 'C');
        this.positions[35] = new Coordinate('4', 'D');
        this.positions[36] = new Coordinate('4', 'E');
        this.positions[37] = new Coordinate('4', 'F');
        this.positions[38] = new Coordinate('4', 'G');
        this.positions[39] = new Coordinate('4', 'H');

        this.positions[40] = new Coordinate('3', 'A');
        this.positions[41] = new Coordinate('3', 'B');
        this.positions[42] = new Coordinate('3', 'C');
        this.positions[43] = new Coordinate('3', 'D');
        this.positions[44] = new Coordinate('3', 'E');
        this.positions[45] = new Coordinate('3', 'F');
        this.positions[46] = new Coordinate('3', 'G');
        this.positions[47] = new Coordinate('3', 'H');

        this.positions[48] = new Coordinate('2', 'A', new Pawn('P', "white"));
        this.positions[49] = new Coordinate('2', 'B', new Pawn('P', "white"));
        this.positions[50] = new Coordinate('2', 'C', new Pawn('P', "white"));
        this.positions[51] = new Coordinate('2', 'D', new Pawn('P', "white"));
        this.positions[52] = new Coordinate('2', 'E', new Pawn('P', "white"));
        this.positions[53] = new Coordinate('2', 'F', new Pawn('P', "white"));
        this.positions[54] = new Coordinate('2', 'G', new Pawn('P', "white"));
        this.positions[55] = new Coordinate('2', 'H', new Pawn('P', "white"));
        this.positions[56] = new Coordinate('1', 'A', new Rook('R', "white"));
        this.positions[57] = new Coordinate('1', 'B', new Horse('H', "white"));
        this.positions[58] = new Coordinate('1', 'C', new Elephant('E', "white"));
        this.positions[59] = new Coordinate('1', 'D', new King('K', "white"));
        this.positions[60] = new Coordinate('1', 'E', new Queen('Q', "white"));
        this.positions[61] = new Coordinate('1', 'F', new Elephant('E', "white"));
        this.positions[62] = new Coordinate('1', 'G', new Horse('H', "white"));
        this.positions[63] = new Coordinate('1', 'H', new Rook('R', "white"));



    }

    public Coordinate[] getPositions() {
        return positions;
    }

    public void setPositions(Coordinate[] positions) {
        this.positions = positions;
    }


    @Override
    public void change(Figure figure, Coordinate start, Coordinate end) {
        for (Coordinate boardPosition :
             this.positions) {
            if (boardPosition.getLetter() == start.getLetter() && boardPosition.getDigit() == start.getDigit()){
                boardPosition.setFigure(null);
            }
            if (boardPosition.getLetter() == end.getLetter() && boardPosition.getDigit() == end.getDigit()){
                boardPosition.setFigure(figure);
            }
        }
    }
}
