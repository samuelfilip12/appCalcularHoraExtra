package projeto.samuel.appcalcularhoraextra;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.util.Locale;

public class Data {

    private LocalDate data;
    private DayOfWeek diaSemana;

    // Getter para obter a data
    public LocalDate getData() {
        return data;
    }

    // Setter para configurar a data e calcular o dia da semana
    public void setData(String dataString) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            this.data = LocalDate.parse(dataString, formato);
            // Calculando o dia da semana correspondente à data
            this.diaSemana = this.data.getDayOfWeek();
        } catch (Exception e) {
            System.out.println("Formato de data inválido. Certifique-se de usar o formato dd/MM/yyyy.");
        }
    }

    // Getter para obter o dia da semana
    public DayOfWeek getDiaSemana() {
        return diaSemana;
    }

    // Getter para obter o nome do dia da semana
    public String getNomeDiaSemana() {
        return diaSemana.getDisplayName(java.time.format.TextStyle.FULL, Locale.getDefault());
    }
}
