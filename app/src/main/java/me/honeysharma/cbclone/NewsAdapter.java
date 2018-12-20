package me.honeysharma.cbclone;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsAdapter extends ArrayAdapter {

    int[] imgArray;
    String[] headingArray;
    String[] newsArray;

    public NewsAdapter(Context context,String[] news, String[] heading, int[] img){

        super(context,R.layout.storiesadapter,R.id.heading,heading);
        this.imgArray=img;
        this.newsArray=news;
        this.headingArray=heading;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflate=(LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row=inflate.inflate(R.layout.storiesadapter,parent,false);

        ImageView image=(ImageView)row.findViewById(R.id.idPic);
        TextView heading=(TextView)row.findViewById(R.id.heading);
        TextView news1=(TextView)row.findViewById(R.id.news1);
        TextView news2=(TextView)row.findViewById(R.id.news2);
        TextView news3=(TextView)row.findViewById(R.id.news3);

        image.setImageResource(imgArray[position]);
        heading.setText(headingArray[position]);
        news1.setText(newsArray[position]);
        news2.setText(newsArray[position]);
        news3.setText(newsArray[position]);

        return row;
    }
}
