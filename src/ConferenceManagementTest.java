import Model.Talk;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConferenceManagementTest {

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ConferenceManagement.main(args);


    }

    /**
     * Test of CreateTalk method, of class ConferenceManagement.
     */
    @Test
    public void testCreateTalk() {
        System.out.println("CreateTalk");
        String title = "";
        int time = 23;
        int expResult = 0;
        int result = ConferenceManagement.CreateTalk(title, time).size();
        assertEquals(expResult, result);

    }

    @Test
    void testCreateSession() {
        List<Talk> talks = new ArrayList<>();
        try {
            talks.add(new Talk("Ruby Rails", 45));
            talks.add(new Talk("OPP", 55));
            talks.add(new Talk("C programming", 35));
            talks.add(new Talk("Network security", 65));
            talks.add(new Talk("Network systems", 65));
            talks.add(new Talk("Embedded Systems",60));

            assertEquals(2,ConferenceManagement.CreateSession(talks).size());
        }catch (Exception ex){

        }

    }

    @Test
    void testcreateTrack() {
        try {
            List<Talk> talks = new ArrayList<>();
            talks.add(new Talk("Ruby Rails", 45));
            talks.add(new Talk("OPP", 55));
            talks.add(new Talk("C programming", 35));
            talks.add(new Talk("Network security", 65));
            talks.add(new Talk("Network systems", 65));
            talks.add(new Talk("Embedded Systems",60));

            assertEquals(3, ConferenceManagement.CreateTrack(ConferenceManagement.CreateSession(talks)).size());
        }catch (Exception ex){

        }

    }
}
