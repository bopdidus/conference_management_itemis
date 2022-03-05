package com.mycompany.conferencemanagement.Model;

import com.mycompany.conferencemanagement.Model.SessionType;
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


    public void AddTalks(ArrayList<Talk> tls)  {
       switch (this.type){
           case MORNING:
                        for (Talk t: tls){
                            if(this.SumTime()<=180){
                                this.talks.add(t);
                            }
                            else
                                break;
                        }

               break;
           case AFTERNOON:
               for (Talk t: tls){
                   if(this.SumTime() <=240){
                       this.talks.add(t);
                   }
                   else
                       break;
               }
               break;
       }
    }
}
