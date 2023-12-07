package projeto.samuel.appcalcularhoraextra;

import java.time.Duration;

public class Calcular {

    private Horas objH;

    // Construtor que aceita uma instância de Horas
    public Calcular(Horas objH) {
        this.objH = objH;
    }

    public Duration calcularHorasTrabalhadas() {
        if (objH.getEntrada() != null && objH.getInIntervalo() != null
                && objH.getFimIntervalo() != null && objH.getSaida() != null) {
            // Calcula a duração total trabalhada, subtraindo o intervalo
            Duration duracaoTotal = Duration.between(objH.getEntrada(), objH.getSaida());
            Duration duracaoIntervalo = Duration.between(objH.getInIntervalo(), objH.getFimIntervalo());
            return duracaoTotal.minus(duracaoIntervalo);
        } else {
            // Se algum dos tempos não estiver definido, retorna Duration.ZERO
            return Duration.ZERO;
        }
    }
}
