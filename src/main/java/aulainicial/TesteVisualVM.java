package aulainicial;

import static java.lang.Thread.sleep;

// @author Marcelo Neves
public class TesteVisualVM {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            byte[] dados = new byte[21_000_000]; // +1MB no Heap
            sleep(500);
        }
    }
}
