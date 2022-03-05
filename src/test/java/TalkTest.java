
import com.mycompany.conferencemanagement.Model.Talk;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class TalkTest {

    private Talk talk1;
    private Talk talk2;
    
    @BeforeEach
    public void CreateInstance(){
       try {
           talk1 = new Talk("Ruby0 Ra7ils", 22);
           talk2 = new Talk("OPP Programming", 35);
       }catch (Exception e){

       }

    }


    @Test
    void getTitle() {
    }

    @Test
    void setTitle() {
    }

    @Test
    void getTime() {
    }

    @Test
    void setTime() {
    }


}
