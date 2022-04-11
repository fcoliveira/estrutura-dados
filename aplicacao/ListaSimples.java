package aplicacao;

public class ListaSimples {

    private No inicio;
    private No fim;

    private double somaGlobalMedias;
    private int qtdAlunos;

    private int qtdAlunosAcimaMedia = 0;
    private int qtdAlunosAbaixoMedia = 0;

    private double getMediaGlobal(){
        return somaGlobalMedias / qtdAlunos;
    }

    /**
     * Q4.a
     * Um método para inserir um elemento na lista
     */
    public void insereAluno(Aluno aluno){

        somaGlobalMedias = somaGlobalMedias + aluno.getMedia();
        qtdAlunos++;

        No noMaisRecente = new No(aluno, null);
        fim.setProximoNo(noMaisRecente);
        fim = noMaisRecente;
    }

    /**
     * Q4.b
     * Um metodo para exibir um relatorio completo de todos os alunos com nota1, nota2, e média calculada
     */
    public void exibeRelatorioCompleto(){
       this.imprimeAlunosDaLista(inicio);
    }

    private void imprimeAlunosDaLista(No referencia){

        if(null == referencia.getProximoNo()){
            return;
        }

        Aluno aluno = referencia.getAluno();
        System.out.println(aluno);

        imprimeAlunosDaLista(referencia.getProximoNo());

    }

    /**
     * Q4.c
     * Um método para gerar um relatório estatístico que informe a média global dos alunos e a quantidade de
     * alunos acima da média e abaixo da média.
     */
    public void obterRelatorioEstatistico(){

        this.calculaEstatistica(this.inicio);

        System.out.printf(
                "media global: %s, alunos acima da media: %s, alunos abaixo da media: %s\n",
                this.getMediaGlobal(), qtdAlunosAcimaMedia, qtdAlunosAbaixoMedia
        );

    }

    private void calculaEstatistica(No referencia){

        if(null == referencia.getProximoNo()){
            return;
        }

        Aluno aluno = referencia.getAluno();
        double mediaAluno = aluno.getMedia();

        if(mediaAluno < getMediaGlobal()){
            qtdAlunosAbaixoMedia++;
        }else if (mediaAluno > getMediaGlobal()){
            qtdAlunosAcimaMedia++;
        }

        calculaEstatistica(referencia);

    }

    /**
     * Q4.d
     * Escreva um metodo para inserir um elemento no inicio da lista
     */
    public void insereNoInicioDaLista(Aluno aluno){

        No novoInicioDaLista = new No(aluno, this.inicio);
        this.inicio = novoInicioDaLista;

    }
}
