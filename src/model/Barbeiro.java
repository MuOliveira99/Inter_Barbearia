package model;

public class Barbeiro extends Pessoa {
    private String especialidade;

    // Construtores
    public Barbeiro() {}

    public Barbeiro(Integer id, String nome, String telefone, String especialidade) {
        super.setId(id);           // Inicializa os atributos herdados de Pessoa
        super.setNome(nome);
        super.setTelefone(telefone);
        this.especialidade = especialidade; // Inicializa o atributo exclusivo de Barbeiro
    }

    // Getter e Setter para especialidade
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
