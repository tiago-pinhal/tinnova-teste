
import com.testes.exercicio1.Votacao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Tiago Pinhal
 */
public class VotacaoTest {

    private final Votacao votacao = new Votacao();

    @Test
    void porcentagens() throws Exception {
        int numeroDeEleitores = 1000;
        int numeroVotosEmBranco = 150;
        int numeroVotosNulos = 50;

        votacao.setQtdTotalVotos(numeroDeEleitores);
        votacao.setQtdVotosEmBranco(numeroVotosEmBranco);
        votacao.setQtdVotosNulo(numeroVotosNulos);

        Assertions.assertEquals(0.8, votacao.getPercentualVotosValidos());
        Assertions.assertEquals(0.15, votacao.getPercentualVotosEmBranco());
        Assertions.assertEquals(0.05, votacao.getPercentualVotosNulo());
    }

}
