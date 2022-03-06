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

    public int SumTime(){
        int sum =0;
        for(Talk t: this.talks){
            sum += t.getTime();
        }
        return sum;
    }


    public List<Talk> AddTalks(List<Talk> tls) {
        int i = 0;
        if (type == SessionType.MORNING) {
            for (i = 0; i < tls.size(); i++) {
                if((this.SumTime() + tls.get(i).getTime()) > 180)
                {
                    for(int k=i;k< tls.size();k++)
                    {
                        if((this.SumTime() + tls.get(k).getTime()) == 180)
                        {
                            this.talks.add(tls.get(k));
                        }
                    }
                    break;
                }else{
                    this.talks.add(tls.get(i));
                }
            }
            return (i== tls.size())?null:tls.subList(i, tls.size() - 1);
        }

        else {
            i = 0;
            for (i = 0; i < tls.size(); i++) {
                if((this.SumTime() + tls.get(i).getTime()) > 240)
                {
                    for(int k=i;k< tls.size();k++)
                    {
                        if((this.SumTime() + tls.get(k).getTime()) <= 240)
                        {
                            this.talks.add(tls.get(k));
                        }
                    }
                    break;
                }else{
                    this.talks.add(tls.get(i));
                }
            }
            return (i== tls.size())?null:tls.subList(i, tls.size() - 1);
        }

    }

}
