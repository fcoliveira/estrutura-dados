package aplicacao;

public class Aluno{

    /**
     * Q1.a
     */
    private String nome;
    private long ra;
    private double nota1;
    private double nota2;
    private double media;

    /**
     * Q1.b
     */
    public Aluno() {}

    /**
     * Q1.b
     * Nesse construtor, o enunciado cita a necessidade de ter todos os parâmetros,
     * mas isso é conflitante com o que se pede nos itens em seguida: atribuição automática de ra sequencial
     * e de calculo de media.
     * @param nome
     * @param nota1
     * @param nota2
     */
    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.ra = this.obtemRaDisponivel();
        this.media = this.calculaMedia(nota1, nota2);
    }

    /**
     * Q1.c
     */
    private static long proximoRaDisponivel = 2000;

    /**
     * Q1.d
     */
    private double calculaMedia(double nota1, double nota2){
         return (0.3 * nota1) + (0.7 * nota2);
    }

    /**
     * Q1.c
     * Incrementa o contador global de ra e retorna o valor atualizado;
     */
    private long obtemRaDisponivel(){

        long atual = proximoRaDisponivel;
        proximoRaDisponivel++;

        return atual;
    }

    public String getNome() {
        return nome;
    }

    public long getRa() {
        return ra;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public String toString(){

        return String.format(
                "ra: %s, nota1: %s, nota2: %s, media: %s",
                ra, nota1, nota2, media
        );
    }
}