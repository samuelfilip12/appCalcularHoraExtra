package projeto.samuel.appcalcularhoraextra;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class appCalcularHoraExtra {

    public static void main(String[] args) {
        Data objD = new Data();
        Horas objH = new Horas();

        Scanner sc = new Scanner(System.in);

        // Adicionando a data:
        System.out.println("========================================================================");
        System.out.println("");
        System.out.print("Data: ");
        String dataString = sc.nextLine();
        // Chamando e adicionando o método setData da instância objD
        objD.setData(dataString);

        // Adicionando hora Entrada:
        System.out.print("Entrada (HH:mm): ");
        // Lendo a entrada como String
        String entradaString = sc.nextLine();
        // Convertendo a String para LocalTime e configurando o objeto Horas
        objH.setEntrada(LocalTime.parse(entradaString));

        // Adicionando inicio Intervalo:
        System.out.print("Inicio Intervalo (HH:mm): ");
        // Lendo a Inicio Intervalo como String
        String inIntevalo = sc.nextLine();
        // Convertendo a String para LocalTime e configurando o objeto Horas
        objH.setInIntervalo(LocalTime.parse(inIntevalo));

        // Adicionando Fim Intervalo:
        System.out.print("Fim Invervalo (HH:mm): ");
        // Lendo a Fim Intervalo como String
        String fimIntevalo = sc.nextLine();
        // Convertendo a String para LocalTime e configurando o objeto Horas
        objH.setFimIntervalo(LocalTime.parse(fimIntevalo));

        // Adicionando hora Saida:
        System.out.print("Saída (HH:mm): ");
        // Lendo a entrada como String
        String saidaString = sc.nextLine();
        // Convertendo a String para LocalTime e configurando o objeto Horas
        objH.setSaida(LocalTime.parse(saidaString));

        // Calcular as horas trabalhadas usando a classe Calcular
        Calcular objC = new Calcular(objH);
        Duration horasTrabalhadas = objC.calcularHorasTrabalhadas();

        // Exibir o resultado
        exibirResultado(objH, horasTrabalhadas);
    }

    // Método para exibir o resultado do cálculo
    private static void exibirResultado(Horas horas, Duration horasTrabalhadas) {
        System.out.println("Horas trabalhadas: " + horasTrabalhadas.toHours() + " horas e "
                + (horasTrabalhadas.toMinutesPart() % 60) + " minutos\n");
    }
}
