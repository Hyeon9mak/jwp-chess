package chess.dao;

import chess.dto.RoomDTO;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class RoomDAO {

    private final JdbcTemplate jdbcTemplate;

    public RoomDAO(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void createRoom(final String title, final String id, final String password) {
        String query = "INSERT INTO room (title, white_nickname, white_password, status) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(query, title, id, password, "준비중");
    }

    public List<RoomDTO> allRooms() {
        String query = "SELECT id, title, black_nickname, white_nickname, status FROM room ORDER BY room.id DESC";
        return jdbcTemplate.query(query, mapper());
    }

    private RowMapper<RoomDTO> mapper() {
        return (resultSet, rowNum) -> {
            return new RoomDTO(
                resultSet.getInt("id"),
                resultSet.getString("title"),
                resultSet.getString("black_nickname"),
                resultSet.getString("white_nickname"),
                resultSet.getString("status")
            );
        };
    }

    public void changeStatusEndByRoomId(final String roomId) {
        String query = "UPDATE room SET status = 0 WHERE id = ?";
        jdbcTemplate.update(query, roomId);
    }

    public List<String> allRoomIds() {
        RowMapper<String> rowMapper = (resultSet, rowNum) -> resultSet.getString("id");

        String query = "SELECT id FROM room";
        return jdbcTemplate.query(query, rowMapper);
    }
}
