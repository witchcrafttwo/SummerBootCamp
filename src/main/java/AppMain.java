
import model.Emp;
import model.EmpDao;
import model.Ranking;
import model.RankingDAO;

import java.sql.SQLException;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        RankingDAO rankingDao = new RankingDAO();

        List<Ranking> rankingList = rankingDao.connect();

        for (Ranking ranking : rankingList) {
            System.out.printf(
                    "USERNAME: %s, SCORE: %d, DIFFICULTY: %s\n",
                    ranking.getUSERNAME(),
                    ranking.getSCORE(),
                    ranking.getDIFFICULTY());
        }

    }
}