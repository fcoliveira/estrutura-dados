package aplicacao;

public class No {

    private Aluno aluno;
    private No proximoNo;

    public No(Aluno aluno, No proximoNo) {
        this.aluno = aluno;
        this.proximoNo = proximoNo;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }
}
