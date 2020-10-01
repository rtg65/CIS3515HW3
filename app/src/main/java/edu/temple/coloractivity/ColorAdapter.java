package edu.temple.coloractivity;


import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.content.Context;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter{
    private Context c;
    private int count;
    private String[] colors;

    public ColorAdapter(Context c, int cnt, String[] clr){
        colors = clr;
        count = cnt;
        this.c = c;
    }

    @Override
    public int getCount(){
        return count;
    }

    public Context getC() {
        return c;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            TextView text = new TextView(c);
            text.setText(colors[position]);
            text.setBackgroundColor(Color.parseColor(colors[position]));
            return text;
        } else {
            TextView text = (TextView) convertView;
            text.setText(colors[position]);
            text.setBackgroundColor(Color.parseColor(colors[position]));
            return text;
        }
    }
}
