package me.honeysharma.cbclone;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager,mViewPager1;
    private CardPagerAdapter mCardAdapter;
    private CardVadaptor mCardAdapter1;
    private BottomNavigationView bottomNavigationView;

    private ListView lv,lv1,lv2;
    /*String[][] news={{"New Coach","News 1 comes here","News 3 comes here","News 3 comes here"},
            {"Heading2","News 1 comes here","News 3 comes here","News 3 comes here"},
            {"Heading3","News 1 comes here","News 3 comes here","News 3 comes here"}};
    */

    String[] heading={"New Coach","STIMP-MIC CONUNDRUM","IPL Auction"};
    String[] news={"WV Raman appointed head coach of Indian women's team \n\n The Raman effect: Building a hi-spec assembly line of Indian cricketers ",
            "Spotlight on intrusive coverage after Jadeja-Ishant spat",
            "Who are Shivam Dube, Varun Chakravarthy and Prabhsimran SIngh?"};
    int[] img={R.drawable.news1,R.drawable.news2,R.drawable.news3};

    String[] heading1={"STIMP-MIC CONUNDRUM","IPL Auction","New Coach"};
    String[] news1={ "Spotlight on intrusive coverage after Jadeja-Ishant spat \n\n Thought a fast bowler would be more effective: Kohli",
            "Who are Shivam Dube, Varun Chakravarthy and Prabhsimran SIngh?","WV Raman appointed head coach of Indian women's team"};

    int[] img1={R.drawable.news2,R.drawable.news3,R.drawable.news1};

    String[] heading2={"IPL Auction","New Coach","STIMP-MIC CONUNDRUM"};
    String[] news2={"Who are Shivam Dube, Varun Chakravarthy and Prabhsimran ? \n\n Delhi Capital trade Jayanat Yadav to Mumbai Indians",
            "WV Raman appointed head coach of Indian women's team",
            "Spotlight on intrusive coverage after Jadeja-Ishant spat"};

    int[] img2={R.drawable.news3,R.drawable.news1,R.drawable.news2,};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //for score
        mViewPager = (ViewPager) findViewById(R.id.viewPager);

        mCardAdapter = new CardPagerAdapter();
        mCardAdapter.addCardItem(new CardItem("3rd Match . Big Bash League 2018-19",
                "Melbourn Stars need 33 runs in 6 overs",
                "SYT","MLS","181-5(20)","61-5(7.1)"));

        mCardAdapter.addCardItem(new CardItem("2nd T20I . Windies tour of Bangladesh 2018",
                "Bangladesh won by 36 runs",
                "BAN","WIN","211-4(20)","175(19.2)"));

        mCardAdapter.addCardItem(new CardItem("3rd Match . Pakistan tour of Africa",
                "Day-3: 2nd session",
                "RSA","PAK","318-7 d & 163-5","306-7 d"));

        mCardAdapter.addCardItem(new CardItem("1st Test . Sri Lanka tour of New Zealand",
                "Match Drawn",
                "NZ","SL","578","278 & 287-3"));


        mViewPager.setAdapter(mCardAdapter);
        mViewPager.setOffscreenPageLimit(3);

        //for videos
        mViewPager1 = (ViewPager) findViewById(R.id.viewPager1);

        mCardAdapter1 = new CardVpagerAdapter();
        ((CardVpagerAdapter) mCardAdapter1).addCardItem1(new CardVitem("https://www.demonuts.com/Demonuts/smallvideo.mp4","Kings XI Punjab spend big bucks to rope in Varun Chakravarthy"));
        ((CardVpagerAdapter) mCardAdapter1).addCardItem1(new CardVitem("https://www.demonuts.com/Demonuts/smallvideo.mp4","IPL 2019 Auction Squad Review: Chennai Super Kings"));

        mViewPager1.setAdapter((PagerAdapter) mCardAdapter1);
        mViewPager1.setOffscreenPageLimit(3);

        //listview for top stories
        lv=(ListView)findViewById(R.id.idListView);
        NewsAdapter adapter=new NewsAdapter(this,heading,news,img);
        lv.setAdapter(adapter);

        lv1=(ListView)findViewById(R.id.idListView1);
        NewsAdapter adapter1=new NewsAdapter(this,heading1,news1,img1);
        lv1.setAdapter(adapter1);

        lv2=(ListView)findViewById(R.id.idListView2);
        NewsAdapter adapter2=new NewsAdapter(this,heading2,news2,img2);
        lv2.setAdapter(adapter2);


        //bottomnavigationview

        bottomNavigationView=(BottomNavigationView)findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.home:
                        break;
                    case R.id.matches:
                        break;
                    case R.id.news:
                        break;
                    case R.id.videos:
                        break;
                    case R.id.more:
                        break;

                }
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.setting:
                Intent settingsIntent=new Intent(this,Settings.class);
                startActivity(settingsIntent);
                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}

