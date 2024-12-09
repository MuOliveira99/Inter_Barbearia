package model;

import java.math.BigDecimal;

public class Servico {
    private Integer id;
    private String nomeServico;
    private BigDecimal preco;

    // Construtores
    public Servico() {}

    public Servico(Integer id, String nomeServico, BigDecimal preco) {
        this.id = id;
        setNomeServico(nomeServico); // Usa o setter para validar
        setPreco(preco);             // Usa o setter para validar
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        if (nomeServico == null || nomeServico.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do serviço não pode ser vazio.");
        }
        this.nomeServico = nomeServico;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        if (preco == null || preco.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("O preço deve ser maior ou igual a zero.");
        }
        this.preco = preco;
    }

    
}
