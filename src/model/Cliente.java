package model;

public class Cliente extends Pessoa {
    private String email;

    // Construtores
    public Cliente() {}

    public Cliente(Integer id, String nome, String telefone, String email) {
        super.setId(id);        // Usando os métodos da classe Pessoa
        super.setNome(nome);    // para inicializar os atributos herdados.
        super.setTelefone(telefone);
        this.email = email;     // Atributo exclusivo de Cliente.
    }

    // Getter e Setter para email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
