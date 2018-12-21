package me.honeysharma.cbclone;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CardPagerAdapter extends PagerAdapter implements CardAdapter {

    private List<CardView> mViews;
    private List<CardItem> mData;
    private float mBaseElevation;
    private Context context;

    public CardPagerAdapter(Context context) {
        this.context=context;
        mData = new ArrayList<>();
        mViews = new ArrayList<>();
    }

    public void addCardItem(CardItem item) {
        mViews.add(null);
        mData.add(item);
    }

    public float getBaseElevation() {
        return mBaseElevation;
    }

    @Override
    public CardView getCardViewAt(int position) {
        return mViews.get(position);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext())
                .inflate(R.layout.adapter, container, false);
        container.addView(view);
        bind(mData.get(position), view);
        CardView cardView = (CardView) view.findViewById(R.id.cardView);

        if (mBaseElevation == 0) {
            mBaseElevation = cardView.getCardElevation();
        }

        cardView.setMaxCardElevation(mBaseElevation * MAX_ELEVATION_FACTOR);
        mViews.set(position, cardView);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
        mViews.set(position, null);
    }

    private void bind(CardItem item, View view) {
        TextView titleTextView = (TextView) view.findViewById(R.id.titleTextView);
        TextView winnerTextView = (TextView) view.findViewById(R.id.contentTextView);
        TextView team1=(TextView) view.findViewById(R.id.team1);
        TextView team2=(TextView) view.findViewById(R.id.team2);
        TextView score1=(TextView) view.findViewById(R.id.score1);
        TextView score2=(TextView) view.findViewById(R.id.score2);
        RelativeLayout schedule=(RelativeLayout)view.findViewById(R.id.schedule);

        titleTextView.setText(item.getTitle());
        team1.setText(item.getTeam1());
        team2.setText(item.getTeam2());
        score1.setText(item.getScore1());
        score2.setText(item.getScore1());
        winnerTextView.setText(item.getText());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tabbedActivity=new Intent(v.getContext(),TabbedActivity.class);
                tabbedActivity.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(tabbedActivity);
            }
        });

        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scheduleIntent=new Intent(v.getContext(),ScheduleActivity.class);
                scheduleIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(scheduleIntent);
            }
        });
    }

}
