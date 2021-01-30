package entity;

import chessboard.Coordinate;
import strategy.MoveStrategy;

public class Figure {

    private char icon;
    private String team;

    public Figure(char icon, String team) {
        this.icon = icon;
        this.team = team;
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
}
