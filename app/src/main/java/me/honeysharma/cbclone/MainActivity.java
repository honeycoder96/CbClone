package me.honeysharma.cbclone;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager,mViewPager1;
    private CardPagerAdapter mCardAdapter;
    private CardVadaptor mCardAdapter1;

    private ListView lv,lv1;
    String[][] news={{"New Coach","News 1 comes here","News 3 comes here","News 3 comes here"},
            {"Heading2","News 1 comes here","News 3 comes here","News 3 comes here"},
            {"Heading3","News 1 comes here","News 3 comes here","News 3 comes here"}};

    String[] heading={"Heading1","Heading2","Heading3"};
    String[] news1={"News 1 comes here","News 2 comes here","News 3 comes here"};

    int[] img={R.drawable.news1,R.drawable.news2,R.drawable.news3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //for score
        mViewPager = (ViewPager) findViewById(R.id.viewPager);

        mCardAdapter = new CardPagerAdapter();
        mCardAdapter.addCardItem(new CardItem(R.string.title_1, R.string.text_1));
        mCardAdapter.addCardItem(new CardItem(R.string.title_2, R.string.text_1));
        mCardAdapter.addCardItem(new CardItem(R.string.title_3, R.string.text_1));
        mCardAdapter.addCardItem(new CardItem(R.string.title_4, R.string.text_1));

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
        NewsAdapter adapter=new NewsAdapter(getApplicationContext(),news1,heading,img);
        lv.setAdapter(adapter);

        lv1=(ListView)findViewById(R.id.idListView1);
        NewsAdapter adapter1=new NewsAdapter(getApplicationContext(),news1,heading,img);
        lv1.setAdapter(adapter1);
    }
}

