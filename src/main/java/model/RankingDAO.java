package model;
import java.sql.*;
import java.util.ArrayList;

import secret.DbConfig;
import model.Ranking;
public class RankingDAO {
    String URL = DbConfig.URL;
    String USER = DbConfig.USER;
    String PASSWORD = DbConfig.PASSWORD;
    String SQL = "SELECT * FROM RANKING WHERE DIFFICULTY = ?;";
    RankingDAO rankingDAO = null;
    ArrayList<Ranking> rankings;

    public ArrayList<Ranking> connect()  {
        try (Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
            PreparedStatement ps = conn.prepareStatement(SQL)){
            ps.setString(1, "hard");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Ranking ranking = new Ranking();
                ranking.setUN(rs.getString("UN"));
                ranking.setScore(rs.getInt("SCORE"));
                ranking.setDifficulty(rs.getString("DIFFICULTY"));
                rankings.add(ranking);
                return rankings;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
