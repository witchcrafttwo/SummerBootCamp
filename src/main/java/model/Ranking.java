package model;

public class Ranking {
    String USERNAME = null;
    int SCORE = 0;
    String DIFFICULTY = null;
    public Ranking(){

    }
    public void setUN(String UN){
        this.USERNAME = UN;
    }
    public void setScore(int score){
        this.SCORE = score;
    }
    public void setDifficulty(String diff){
        this.DIFFICULTY = diff;
    }

    public String getUSERNAME() {
        return USERNAME;
    }
    public int getSCORE() {
        return SCORE;
    }
    public String getDIFFICULTY() {
        return DIFFICULTY;
    }
}
