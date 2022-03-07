import Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author armel
 */

public class ConferenceManagement {

    public static void main(String[] args) {
        String title="";
        List<Talk> talks = new ArrayList<Talk>();
        Conference conf;
        int time=0;
        System.out.println("***************WELCOME TO CONFERENCE MANAGEMENT SYSTEM**********************************");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the theme of the conference");
        String theme = sc.nextLine();
        conf = new Conference(theme);
        System.out.println("Please enter the talks and press q(quit) to stop (-: ");
        System.out.println("\n");
        while(!title.equalsIgnoreCase("q"))
        {
            System.out.println("Enter the title:");
            System.out.print(">");
            title = sc.nextLine();

            if(title.equalsIgnoreCase("q") == true)
                break;

            System.out.println("Enter the time:");

            try {
                time = sc.nextInt();
               talks = CreateTalk(title, time);
                sc.nextLine();
            } catch (Exception e) {
                System.err.println(e.getMessage());
                System.out.println("Erreur vous devriez recommencer");
            }
        }

        conf.setTracks(CreateTrack(CreateSession(talks)));

    }

    public static List<Talk> CreateTalk(String title, int time){
        List<Talk> talks = new ArrayList<Talk>();

        try{
            talks.add(new Talk(title, time));

        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("Erreur vous devriez recommencer");
            return talks;
        }
        return talks;
    }

    public static List<Session> CreateSession(List<Talk> list)
    {
        List<Session> sessions = new ArrayList<>();
        while (list.size()>1){
            Session session = new Session(SessionType.MORNING);
            list = session.AddTalks(list);
            sessions.add(session);
            if(list == null || list.size()<=0)
                break;
            Session session1 = new Session(SessionType.AFTERNOON);
            list = session1.AddTalks(list);
            sessions.add(session1);
        }
        return  sessions;
    }

    public static List<Track> CreateTrack(List<Session> list){
        List<Track>tracks = new ArrayList<>();
        int length = (int)Math.ceil(list.size()/2);
        List<Session> morningSession = new ArrayList<>();
        List<Session> afternoonSession = new ArrayList<>();
        for(int i = 0; i<=list.size();i++){
            if(list.get(i).getType() == SessionType.MORNING){
                morningSession.add(list.get(i));
            }else {
                afternoonSession.add(list.get(i));
            }
        }
        for (Session s: morningSession){
            try {
                Track t = new Track();
                t.setMorningSession(s);
                tracks.add(t);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for(int j= 0; j<afternoonSession.size();j++){
            try {
                tracks.get(j).setAfternoonSession(afternoonSession.get(j));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return tracks;
    }
}
