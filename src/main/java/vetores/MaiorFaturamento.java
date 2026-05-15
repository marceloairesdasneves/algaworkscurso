package vetores;

// @author Marcelo Neves
public class MaiorFaturamento {
    public static void main(String[] args) {
        Double[] semanaUm = new Double[]{1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0};
        Double[] semanaDois = new Double[]{1050.0, 2500.0, 13250.0, 29100.0, 14350.0, 1970.0, 0.0};
        Double[] semanaTres = new Double[]{1700.0, 1300.0, 4250.0, 2500.0, 1850.0, 2970.0, 0.0};
        Double[] semanaQuatro = new Double[]{2100.0, 1600.0, 1850.0, 4100.0, 7350.0, 5970.0, 50.0};

        Double[][] mes = new Double[][]{semanaUm, semanaDois, semanaTres, semanaQuatro};
        Double maiorFaturamento = 0.0;
        Double faturamentoSemana;
        int j;
        int semanaGanhadora = 0;

        for (int i = 0; i < mes.length; i++) {
            Double[] semana = mes[i];
            faturamentoSemana = 0.0;
            System.out.println("\n========= Semana: " + (i + 1) + " =========");
            for (j = 0; j < semana.length; j++) {
                System.out.println("Faturamento do dia " + (j + 1) + ": " + semana[j]);
                faturamentoSemana += semana[j];
            }
            if (faturamentoSemana > maiorFaturamento) {
                maiorFaturamento = faturamentoSemana;
                semanaGanhadora = i + 1;
            }
        }

        System.out.println("\n===============================================");
        System.out.println("Semana " + semanaGanhadora + " é a campeã com faturamento de " + maiorFaturamento);
        System.out.println("===============================================");

    }
}
