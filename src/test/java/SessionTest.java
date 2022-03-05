
import com.mycompany.conferencemanagement.Model.Session;
import com.mycompany.conferencemanagement.Model.SessionType;
import org.junit.jupiter.api.BeforeEach;



public class SessionTest {

    private Session afternoonSession;
    private Session morningSession;

    @BeforeEach
    public void CreateInstance() {
        afternoonSession = new Session(SessionType.AFTERNOON);
        morningSession = new Session(SessionType.AFTERNOON);
    }


}
