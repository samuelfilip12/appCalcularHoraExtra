
package projeto.samuel.appcalcularhoraextra;

import java.util.Scanner;
import java.util.Arrays;

public class appCalcularHoraExtra {
    public static void main(String[] args) {
        Data objD = new Data();
        Scanner sc = new Scanner(System.in);
        double horaSabado, horaSemana;
        double horas = 10;
        String[] dsSem = {"segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira"};
        
        //Adicionando a data:
        System.out.println("========================================================================");
        System.out.println("");
        System.out.print("Data: ");
        String dataString = sc.nextLine();
        
        // Chamando e adicionando o método setData da instância objD
        objD.setData(dataString);
        
        objD.getNomeDiaSemana();
        
        String nomeDiaSemana = objD.getNomeDiaSemana();
        
         // Verificando se o nome do dia da semana está no array
        if (Arrays.asList(dsSem).contains(nomeDiaSemana.toLowerCase())) {
        // É um dia de Semana
        horaSemana = horas - 8;
            System.out.println("É um dia de Semana, hora Extra: " + horaSemana);
        } else {
            // o dia da semana caiu em um sábado,
            horaSabado = horas - 4;
            System.out.println("É sábado, horas Extras: " + horaSabado);
        }
        }
        //System.out.println("========================================================================");
        //System.out.println("");
        //System.out.print("Entrada: ");
        
    }
