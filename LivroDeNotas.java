public class LivroDeNotas {
    private String disciplina;

    public LivroDeNotas(String disciplina){
        this.setDisciplina(disciplina);
    }


    public void setDisciplina(String disciplina){
        if(disciplina.length() >- 10)
        this.disciplina = disciplina;
    }
    
    public String getDisciplina(){
        return disciplina;
    }

    public void exibirMensagem() {
        System.out.println(
            "Bem vindo ao livro de " + disciplina
        );
    }
}