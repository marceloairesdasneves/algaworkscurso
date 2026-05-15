package vetores;

// @author Marcelo Neves
public class CalculoVetor2 {
    public static void main(String[] args) {
        //Criando o vetor das semanas do mes, faturamento diario
        Double[][] faturamentoMensal = getDoubles();

        //qual foi essa semana e de quanto foi esse faturamento.//encontre qual a semana teve o maior faturamento
        double maiorFaturamento = 0.0;
        double totalSemana;
        int numeroSemanaMaior = 0;

        for (int i = 0; i < faturamentoMensal.length; i++) {
            System.out.println("Semana: " + (i + 1));
            Double valorDaSemanaAtual = 0.0;

            for (int j = 0; j < faturamentoMensal[i].length; j++) {
                System.out.printf("Dia %d %.2f%n", (j + 1), faturamentoMensal[i][j]);
                valorDaSemanaAtual += faturamentoMensal[i][j];
            }
            totalSemana = valorDaSemanaAtual;

            if (maiorFaturamento < totalSemana) {
                maiorFaturamento = totalSemana;
                numeroSemanaMaior = i + 1;
            }
            System.out.printf("Total dos valores da semana: %.2f%n", totalSemana);
        }
        System.out.printf("A semana [%d] possui o valor %.2f%n", numeroSemanaMaior, maiorFaturamento);
    }

    private static Double[][] getDoubles() {
        Double[] faturamentoSemana1 = new Double[]{100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 0.0};
        Double[] faturamentoSemana2 = new Double[]{200.0, 100.0, 100.0, 100.0, 100.0, 100.0, 0.0};
        Double[] faturamentoSemana3 = new Double[]{11100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 0.0};
        Double[] faturamentoSemana4 = new Double[]{100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 0.0};

        //Criar o vetor do mes bidmensional, guarda o valor mensal
        return new Double[][]{faturamentoSemana1, faturamentoSemana2, faturamentoSemana3, faturamentoSemana4};
    }
}