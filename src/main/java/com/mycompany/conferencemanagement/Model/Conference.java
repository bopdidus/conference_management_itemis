package com.mycompany.conferencemanagement.Model;

import java.util.ArrayList;
import java.util.List;


public class Conference {

    private String theme;
    private List<Track> tracks;

    public Conference(String theme) {
        this.theme = theme;
        this.tracks = new ArrayList<>();
    }

    public int AddTrack(Track _track){
        this.tracks.add(_track);
        return this.tracks.size();
    }
}
