package Model;

import Utils.Verify;

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

    public void setTracks(List<Track> tracks) throws Exception{
        for(Track tr: tracks)
        {
            if(Verify.CheckHoursMorning(tr) != 180){
                throw new Exception(" Morning sessions must finish by 12 noon, for lunch " +Verify.CheckHoursMorning(tr));
            }
            int time = Verify.CheckHourNetworkingEvent(tr);
            if(time > 240 || 180 > time){
                throw new Exception("The networking event can start no earlier than 4:00 and no later than 5:00 pm "+ Verify.CheckHourNetworkingEvent(tr));
            }
        }
        this.tracks = tracks;
    }
}
