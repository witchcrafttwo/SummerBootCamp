package dao;

import model.Ranking;
import secret.DbConfig;

import java.sql.*;
import java.util.ArrayList;

public class RankingDAO {
    private static final String SQL =
            "SELECT USERNAME, SCORE, DIFFICULTY FROM RANKING WHERE DIFFICULTY = ?";

    public ArrayList<Ranking> connect() {
        ArrayList<Ranking> rankings = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(
                DbConfig.URL, DbConfig.USER, DbConfig.PASSWORD);
             PreparedStatement ps = conn.prepareStatement(SQL)) {
            ps.setString(1, "hard");

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Ranking ranking = new Ranking();
                    ranking.setUN(rs.getString("USERNAME"));
                    ranking.setScore(rs.getInt("SCORE"));
                    ranking.setDifficulty(rs.getString("DIFFICULTY"));
                    rankings.add(ranking);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return rankings;
    }
}
