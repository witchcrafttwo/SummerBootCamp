package view;
import model.Ranking;
import dao.RankingDAO;

import java.util.List;
public class RankingView {
    public void rankview(){
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
