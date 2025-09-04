public class LivroDeNotas {
    private String disciplina;

    public void setDisciplina(String d) {
        disciplina = d;
    }
    
public String getDisciplina(){
    return disciplina;
}

    public void exibirMensagem() {
        System.out.println(
            "Bem vindo ao livro de " + disciplina
        );
    }

    public LivroDeNotas(){
        System.out.println("Criando mais um objeto... ");
    }

}