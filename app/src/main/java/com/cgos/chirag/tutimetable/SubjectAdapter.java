package com.cgos.chirag.tutimetable;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CHIRAG on 25-07-2016.
 */
public class SubjectAdapter extends ArrayAdapter{

    List list = new ArrayList();

    public SubjectAdapter(Context context, int resource) {
        super(context, resource);
    }

    static class DataHandler{
        ImageView thumb;
        TextView subject;
        TextView room;
        TextView time;
    }

    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row;
        row = convertView;
        DataHandler handler;
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.custom_row, parent, false);
            handler = new DataHandler();
            handler.thumb = (ImageView) row.findViewById(R.id.thumb);
            handler.subject = (TextView) row.findViewById(R.id.tvSubject);
            handler.room = (TextView) row.findViewById(R.id.tvRoom);
            handler.time = (TextView) row.findViewById(R.id.tvTime);
            row.setTag(handler);
        }

        else{
            handler = (DataHandler)row.getTag();
        }

        SubjectDataProvider dataProvider;
        dataProvider = (SubjectDataProvider) this.getItem(position);
        handler.thumb.setImageResource(dataProvider.getSubject_thumbs_resource());
        handler.subject.setText(dataProvider.getSubject_code());
        handler.room.setText(dataProvider.getRoom_code());
        handler.time.setText(dataProvider.getTime_code());

        return row;
    }
}
