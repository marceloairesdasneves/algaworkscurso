package vetores;

// @author Marcelo Neves

public class Vetores2Dimensoes {
    public static void main(String[] args) {

        Double[] faturamentoJaneiro = new Double[]{1000.0, 2000.0, 3000.0, 4000.0, 5000.0};
        Double[] faturamentoFevereiro = new Double[]{1500.0, 2500.0, 3500.0, 4500.0, 5500.0};

        Double[][] faturamentoAnual = new Double[][]{faturamentoJaneiro, faturamentoFevereiro};

        for (int i = 0; i < faturamentoAnual.length; i++) {
            System.out.println("Faturamento do mês " + (i + 1) + ":");
            for (int j = 0; j < faturamentoAnual[i].length; j++) {
                System.out.println(faturamentoAnual[i][j] + " ");
            }
            System.out.println();
        }
    }
}
