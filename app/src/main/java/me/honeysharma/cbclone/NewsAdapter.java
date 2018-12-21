package me.honeysharma.cbclone;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsAdapter extends ArrayAdapter<String> {

    private Activity context;
    private int[] imgArray;
    private String[] headingArray;
    private String[] newsArray;

    public NewsAdapter(Activity context,String[] heading,String[] news, int[] img){

        super(context,R.layout.storiesadapter,heading);
        this.context=context;
        this.imgArray=img;
        this.newsArray=news;
        this.headingArray=heading;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflate=(LayoutInflater) context.getLayoutInflater();
        View row=inflate.inflate(R.layout.storiesadapter,parent,false);

        ImageView image=(ImageView)row.findViewById(R.id.idPic);
        TextView heading=(TextView)row.findViewById(R.id.heading);
        TextView news1=(TextView)row.findViewById(R.id.news1);

        image.setImageResource(imgArray[position]);
        heading.setText(headingArray[position]);
        news1.setText(newsArray[position]);

        return row;
    }
}
