package model;
import secret.DbConfig;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDao {

    public List<Emp> findAll() throws SQLException {

        String sql =
                "SELECT USERNAME, SCORE, DIFFICULTY "
                        + "FROM RANKING ";

        List<Emp> empList = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(
                DbConfig.URL,
                DbConfig.USER,
                DbConfig.PASSWORD);
        ) {
            Emp emp = new Emp();
            emp.setEmpNo(0);
            emp.setEName("test");
            emp.setJob("connected");

            empList.add(emp);
        }

        return empList;
    }
}