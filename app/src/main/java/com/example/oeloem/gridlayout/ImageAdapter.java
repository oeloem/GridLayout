package com.example.oeloem.gridlayout;



import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public Integer[] mThumbIds = {
            R.drawable.antimage, R.drawable.axe,
            R.drawable.bloodseaker, R.drawable.darkmoon,
            R.drawable.eartshaker, R.drawable.emberspirit,
            R.drawable.invoker, R.drawable.juggernaut,
            R.drawable.luna, R.drawable.pudge,
            R.drawable.sniper, R.drawable.sven,
            R.drawable.ursa, R.drawable.viper,
            R.drawable.warlock, R.drawable.magnus,
            R.drawable.mirana, R.drawable.slark,
            R.drawable.timbersaw, R.drawable.zeus,
            R.drawable.stormspirit, R.drawable.phantomassassin,
            R.drawable.abaddon, R.drawable.ogremagi,
            R.drawable.meepo, R.drawable.shadowshaman,
            R.drawable.clockwerk, R.drawable.witchdoctor
    };

    public ImageAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(250, 250));
        return imageView;
    }

}
