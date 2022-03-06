import Model.Session;
import Model.SessionType;
import Model.Talk;

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
        int time=0;
        System.out.println("***************WELCOME TO CONFERENCE MANAGEMENT SYSTEM**********************************");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("Please enter the talks and press q(quit) to stop (-: ");
        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
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
                CreateTalk(title, time);
                sc.nextLine();
            } catch (Exception e) {
                System.err.println(e.getMessage());
                System.out.println("Erreur vous devriez recommencer");
            }
        }

    }

    public static int CreateTalk(String title, int time){
        List<Talk> talks = new ArrayList<Talk>();

        try{
            talks.add(new Talk(title, time));

        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("Erreur vous devriez recommencer");
            return talks.size();
        }
        return talks.size();
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
}
