package chess.dto;

public final class RoomDTO {
    private final int id;
    private final String title;
    private final String blackUser;
    private final String whiteUser;
    private final String status;

    public RoomDTO(final int id, final String title, final String blackUser, final String whiteUser,
                   final String status) {
        this.id = id;
        this.title = title;
        this.blackUser = blackUser;
        this.whiteUser = whiteUser;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBlackUser() {
        return blackUser;
    }

    public String getWhiteUser() {
        return whiteUser;
    }

    public String getStatus() {
        return status;
    }
}
