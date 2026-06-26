package algoritmosavancados;

// @author Marcelo Neves

public class ListaAlunos {
    static final int QUANTIDADE_LISTA = 5;
    Aluno[] lista = new Aluno[QUANTIDADE_LISTA];

    int tamanhoLista = 0;

    Aluno obter(int indice) {
        return lista[indice];
    }

    int tamanho() {
        return tamanhoLista;
    }
    void adicionar(Aluno aluno){
        if(tamanhoLista == lista.length){
            Aluno[] novoLista = new Aluno[QUANTIDADE_LISTA + lista.length];

            for(int i = 0; i < lista.length; i++){
                novoLista[i] = lista[i];
            }
            lista = novoLista;
        }
        lista[tamanhoLista] = aluno;
        tamanhoLista++;
    }

    void remover(Aluno aluno){
        for(int i = 0; i < lista.length; i++){
            if(lista[i] == aluno){
                remover(i);
                break;
            }
        }
    }
    void remover(int indice){
        int indiceInicial = indice + 1;
        for(int i = indiceInicial; i < tamanhoLista; i++){
            lista[i] = lista[indiceInicial];

        }
        tamanhoLista--;
        lista[tamanhoLista] = null;
    }

}
