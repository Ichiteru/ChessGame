package chessboard;

import entity.Figure;

public class Coordinate {

    private char digit;
    private char letter;
    Figure figure;

    public Coordinate(char digit, char letter, Figure figure) {
        this.digit = digit;
        this.letter = letter;
        this.figure = figure;
    }

    public Coordinate(char digit, char letter) {
        this.digit = digit;
        this.letter = letter;
        this.figure = null;
    }

    public char getDigit() {
        return digit;
    }

    public void setDigit(char digit) {
        this.digit = digit;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }
}
