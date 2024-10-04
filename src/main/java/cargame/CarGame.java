package cargame;

public class CarGame {

    private final String users;
    private final int retry;

    public CarGame(final String users, final int retry) {
        this.users = users;
        this.retry = retry;
    }

    public String[] start() {
        return null;
    }

    public void createUsers() {
        final String[] split = users.split(",");

        for (String user : split) {

        }
    }
}
