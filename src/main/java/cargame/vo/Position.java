package cargame.vo;

public class Position {

    private int position;

    public Position(final int position) {
        this.position = position;
    }

    public int move(final int no) {
        if (no < 4) {
            return position;
        }

        return ++position;
    }
}
