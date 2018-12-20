package me.honeysharma.cbclone;

import android.support.v7.widget.CardView;

public interface CardVadaptor {

    int MAX_ELEVATION_FACTOR = 8;

    float getBaseElevation();

    CardView getCardViewAt(int position);

    int getCount();
}
