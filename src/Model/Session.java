package Model;

import java.util.ArrayList;
import java.util.List;

public class Session {
    private List<Talk> talks;
    private SessionType type;

    public  Session(SessionType _type){
        this.talks = new ArrayList<>();
        this.type = _type;
    }

    public List<Talk> getTalks() {
        return talks;
    }

    public SessionType getType() {
        return type;
    }

}
