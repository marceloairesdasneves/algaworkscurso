package algoritmosavancados;

// @author Marcelo Neves

public class AlgoritimoAvancado {
    public static void main(String[] args){
        ListaAlunos lista = new ListaAlunos();

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Joao";
        lista.adicionar(aluno1);

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Maria";
        lista.adicionar(aluno2);

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Pedro";
        lista.adicionar(aluno3);

        Aluno aluno4 = new Aluno();
        aluno4.nome = "Alexandre";
        lista.adicionar(aluno4);

        Aluno aluno5 = new Aluno();
        aluno5.nome = "Thiago";
        lista.adicionar(aluno5);

        for(int i = 0; i < lista.tamanho(); i++){
            Aluno a = lista.obter(i);
            System.out.println("Aluno: " + a.nome);
        }

        System.out.println("--------------------------------------");
        lista.remover(aluno3);

        for(int i = 0; i < lista.tamanho(); i++){
            Aluno a = lista.obter(i);
            System.out.println("Aluno: " + a.nome);
        }

    }
}
