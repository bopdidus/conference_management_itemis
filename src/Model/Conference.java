package Model;

import java.util.ArrayList;
import java.util.List;

public class Conference {
    private String theme;
    private List<Track> tracks;

    public Conference(String theme) {
        this.theme = theme;
        this.tracks = new ArrayList<>();
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }
}
