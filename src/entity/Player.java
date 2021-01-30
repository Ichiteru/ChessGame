package entity;

import java.util.ArrayList;
import java.util.List;

public class Player {

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
}
