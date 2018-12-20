package me.honeysharma.cbclone;

public class CardVitem {
    private String mUrl="https://www.youtube.com/watch?v=NepFElSFi7o";
    private String mTitle="Yuvraj Singh to don Mumbai Indians' colours in IPL 2019";

    public CardVitem(String url, String title) {
        mTitle = title;
        mUrl = url;
    }

    public String  getUrl() {
        return mUrl;
    }

    public String getTitle() {
        return mTitle;
    }
}
