package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pollyslchan on 20/6/2017.
 */

public class WordAdapter extends ArrayAdapter<Word>{

    //private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    //class constructor
    public WordAdapter (Activity context, ArrayList<Word> words){
        super(context, 0, words);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Check if existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        //Get the Word object located at this position in the list
        Word currentWord = getItem(position);

        //Find and set the TextView in the list_item.xml with getTranslation from current Word object
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        //return the whole list item layout (containing the 2 TextViews as return object)
        return listItemView;



    }


}
