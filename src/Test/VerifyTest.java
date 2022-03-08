package Test;

import Model.Track;
import Utils.Verify;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VerifyTest{
        private Track track;

        @BeforeEach
        public void CreateInstance()
        {
                track = new Track();
        }

        @Test
        public void ContainsDigitTest()
        {
                String test = "jfglj44s1gg";

                assertTrue(Verify.ContainsDigit(test));
        }

        @Test
        public void ContainsDigitTest2()
        {
                String test = "eifufsdjfjsd";

                assertFalse(Verify.ContainsDigit(test));
        }

        @Test
        public void CheckLigthningFiveTest()
        {
                assertTrue(Verify.CheckLigthningFive(25));
        }


        @Test
        public void CheckLigthningFiveTest2()
        {
                assertFalse(Verify.CheckLigthningFive(13));
        }

        @Test
        public void CheckHoursMorningTest()
        {
                assertEquals(0, Verify.CheckHoursMorning(track));
        }

        @Test
        public void CheckHourNetworkingEventTest()
        {
                int somme = Verify.CheckHourNetworkingEvent(track);
                assertFalse((somme <= 240 && 180 <= somme));
        }
}
