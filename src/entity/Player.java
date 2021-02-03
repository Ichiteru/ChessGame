package entity;

import chessboard.Board;
import chessboard.Coordinate;
import service.AbleToMoveFigure;
import service.CorrectInputChecker;
import service.FigureChooser;
import strategy.MoveStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player implements AbleToMoveFigure {

    private String team;
    private String nickname;
    private List<Figure> figures;

    public Player(String team, String nickname) {
        this.team = team;
        this.nickname = nickname;
        this.figures = new ArrayList<>();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public void moveFigure(Board board) {
        Scanner in = new Scanner(System.in);
        String startPosition = null;
        String finalPosition = null;
        Coordinate startCoordinate;
        Coordinate endCoordinate;
        Figure chosenFigure;
        MoveStrategy.setMoveOptions(board);
        do {
                do {
                    System.out.println("Укажите координаты фигуры, которой хотите ходить: ");
                    startPosition = in.nextLine();
                    }   while (!CorrectInputChecker.checkInputString(startPosition));
                startCoordinate = new Coordinate(startPosition.charAt(1), startPosition.charAt(0));
                chosenFigure = FigureChooser.getFigureByCoordinate(board, startCoordinate);
        }   while(chosenFigure == null || chosenFigure.getTeam() != this.team);

        do {

                do {
                    System.out.println("Укажите координату, в которую хотите ходить: ");
                    finalPosition = in.nextLine();
                    }    while (!CorrectInputChecker.checkInputString(finalPosition));
                endCoordinate = new Coordinate(finalPosition.charAt(1), finalPosition.charAt(0));

        }   while(!MoveStrategy.isPositionCorrespond(endCoordinate, chosenFigure));
        board.change(chosenFigure,startCoordinate,endCoordinate);
    }
}
