package com.extmbt.musicplayer;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by EXTMBT on 16-09-2015.
 */
public class SongAdapter extends BaseAdapter {


    //instantiate
    private ArrayList<Song> songs;
    private LayoutInflater songInf;

    //create Constructor
    public SongAdapter(Context c, ArrayList<Song> theSongs){
        songs=theSongs;
        songInf=LayoutInflater.from(c);
    }


    @Override
    public int getCount() {
        return songs.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    /*We set the title and artist text by retrieving the correct Song instance from the list using the position index,
     mapping these strings to the views we added to the song layout file. We also set the position as the view tag,
     which will let us play the correct song when the user clicks an item in the list.
     Remember that the song.xml layout file included an onClick attribute.
     We will use the method listed there to retrieve the tag in the Activity*/
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //map to song layout
        LinearLayout songLay = (LinearLayout)songInf.inflate
                (R.layout.song, parent, false);
        //get title and artist views
        TextView songView = (TextView)songLay.findViewById(R.id.song_title);
        TextView artistView = (TextView)songLay.findViewById(R.id.song_artist);
        //get song using position
        Song currSong = songs.get(position);
        //get title and artist strings
        songView.setText(currSong.getTitle());
        artistView.setText(currSong.getArtist());
        //set position as tag
        songLay.setTag(position);
        return songLay;
    }
}
