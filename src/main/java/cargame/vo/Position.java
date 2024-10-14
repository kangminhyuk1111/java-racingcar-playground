package cargame.vo;

public class Position {

    private int position;

    public Position(final int position) {
        this.position = position;
    }

    public int getPosition() {
        position = position + 1;
        return position;
    }

    public void move(final int no) {
        if (no < 4) {
            return;
        }
        position++;
    }
}
