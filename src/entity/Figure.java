package entity;

import chessboard.Board;
import chessboard.Coordinate;

import java.util.ArrayList;
import java.util.List;

public abstract class Figure {

    private char icon;
    private String team;
    List<Coordinate> moveOptions;

    public Figure(char icon, String team) {
        this.icon = icon;
        this.team = team;
        this.moveOptions = new ArrayList<>();
    }

    public char getIcon() {
        return icon;
    }

    public void setIcon(char icon) {
        this.icon = icon;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public List<Coordinate> getMoveOptions() {
        return moveOptions;
    }

    public void setMoveOptions(List<Coordinate> moveOptions) {
        this.moveOptions = moveOptions;
    }

    public abstract void fullPositionsToMove(Board board, Coordinate startPosition);
}
