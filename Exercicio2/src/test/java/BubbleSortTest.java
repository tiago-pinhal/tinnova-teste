
import com.teste.exercicio2.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Tiago Pinhal
 */
public class BubbleSortTest {

    @Test
    void porcentagens() {
        int[] desordenado = {5, 3, 2, 4, 7, 1, 0, 6};
        int[] ordenado = {1, 2, 3, 4, 5, 6, 7};
        Assertions.assertEquals(ordenado, BubbleSort.ordenarVetor(desordenado));
    }
}
