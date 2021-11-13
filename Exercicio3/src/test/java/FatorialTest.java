
import com.teste.exercicio3.Fatorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

/**
 *
 * @author Tiago Pinhal
 */
public class FatorialTest {

    int[] returns = {1, 2, 6, 24, 120, 720};

    @RepeatedTest(6)
    void fatorials(RepetitionInfo repetitionInfo) {
        Assertions.assertEquals(returns[repetitionInfo.getCurrentRepetition() - 1], Fatorial.getFatorialFrom(repetitionInfo.getCurrentRepetition()));
    }
}
