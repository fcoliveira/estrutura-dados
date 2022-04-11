package testes;

import java.io.Console;

import aplicacao.ListaSimples;

public class TesteApp {

    private ListaSimples alunosTeste =  PopulacaoAlunosTest.obterPopulacaoTeste();

    public static void main(String[] args) {

        TesteApp aplicacao = new TesteApp();

        Console console = System.console();
        boolean continuaExecucao = true;
        while (continuaExecucao){

            try{

                System.out.println("Suas opcoes sao:");
                aplicacao.imprimeComandosDisponiveis();

                String comando = console.readLine();
                aplicacao.processaComando(comando);

            }catch (Exception e){
                System.out.println("Encerrando o programa..");
                continuaExecucao = false;
            }

        }

    }

    private void imprimeComandosDisponiveis(){

    }

    private void processaComando(String comando){

    }
}
