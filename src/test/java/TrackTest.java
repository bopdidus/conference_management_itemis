
import com.mycompany.conferencemanagement.Model.SessionType;
import com.mycompany.conferencemanagement.Model.Talk;
import com.mycompany.conferencemanagement.Model.Track;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class TrackTest {

    private Track track;
    
    @BeforeEach
    public  void CreateInstance(){
        track = new Track();
        //Here we should sort the list of talks
    }

    @Test
    public void ShouldHaveTwoTrack(){
        assertEquals(true, (track.getMorningSession().getType() == SessionType.MORNING && track.getAfternoonSession().getType() == SessionType.AFTERNOON));
    }

    // the morning session should begin at 9 Am and should finish 12pm, that means it is 180 min
    @Test
    public void CheckHours(){
        int sumTime=0;
        for (Talk t:track.getMorningSession().getTalks()) {
            sumTime += t.getTime();
        }
        assertTrue(180== sumTime);
    }

   
    @Test
    public void CheckHourNetworkingEvent(){
        int sumTime=0;
        for (Talk t:track.getAfternoonSession().getTalks()) {
            sumTime += t.getTime();
        }
        assertTrue( sumTime<=240 && 180<= sumTime);
    }
}
