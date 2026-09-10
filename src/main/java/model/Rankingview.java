package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import secret.DbConfig;
public class Rankingview {
    String URL = DbConfig.URL;
    String USER = DbConfig.USER;
    String PASSWORD = DbConfig.PASSWORD;

    public void connect()  {
        try (Connection conn = DriverManeger.getConnection(url.user,password)){

        }

    }
}
