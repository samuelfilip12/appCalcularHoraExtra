package projeto.samuel.appcalcularhoraextra;

import java.time.Duration;
import java.time.LocalTime;

public class Horas {

    private LocalTime entrada, iIntervalo, fIntervalo, saida;

    //Contrução Entrada
    public LocalTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalTime entrada) {

        this.entrada = entrada;
    }

    //Contrução Inicio Intervalo
    public LocalTime getInIntervalo() {
        return iIntervalo;
    }

    public void setInIntervalo(LocalTime iIntervalo) {
        this.iIntervalo = iIntervalo;
    }
    //

    public LocalTime getFimIntervalo() {
        return fIntervalo;
    }

    public void setFimIntervalo(LocalTime fIntervalo) {
        this.fIntervalo = fIntervalo;
    }

    //Contrução saida
    public LocalTime getSaida() {
        return saida;
    }

    public void setSaida(LocalTime saida) {
        this.saida = saida;
    }

}
