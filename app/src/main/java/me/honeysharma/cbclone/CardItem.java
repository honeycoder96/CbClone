package me.honeysharma.cbclone;


public class CardItem {

    private String mTextResource;
    private String mTitleResource;
    private String team1;
    private String team2;
    private String score1;
    private String score2;




    public CardItem(String title, String text, String team1,String team2,String score1,String score2) {
        mTitleResource = title;
        this.team1=team1;
        this.team2=team2;
        this.score1=score1;
        this.score2=score2;
        mTextResource = text;
    }

    public String getText() {
        return mTextResource;
    }

    public String getTitle() {
        return mTitleResource;
    }

    public String getTeam1(){
        return team1;
    }

    public String getTeam2(){
        return team2;
    }

    public String getScore1(){
        return score1;
    }

    public String getScore2(){
        return score2;
    }
}
