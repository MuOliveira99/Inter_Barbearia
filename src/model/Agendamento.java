package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Agendamento {
    private Integer id;
    private LocalDate data;
    private LocalTime hora;
    private Cliente cliente;
    private Barbeiro barbeiro;
    private List<Servico> servicos;

    // Construtor
    public Agendamento(Integer id, LocalDate data, LocalTime hora, Cliente cliente, Barbeiro barbeiro, List<Servico> servicos) {
        setId(id);
        setData(data);
        setHora(hora);
        setCliente(cliente);
        setBarbeiro(barbeiro);
        setServicos(servicos);
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("ID do agendamento deve ser maior que 0.");
        }
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        if (data == null || data.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("A data do agendamento não pode ser nula ou anterior à data atual.");
        }
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        if (hora == null || hora.isBefore(LocalTime.now())) {
            throw new IllegalArgumentException("A hora do agendamento não pode ser nula ou anterior à hora atual.");
        }
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("O cliente não pode ser nulo.");
        }
        this.cliente = cliente;
    }

    public Barbeiro getBarbeiro() {
        return barbeiro;
    }

    public void setBarbeiro(Barbeiro barbeiro) {
        if (barbeiro == null) {
            throw new IllegalArgumentException("O barbeiro não pode ser nulo.");
        }
        this.barbeiro = barbeiro;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        if (servicos == null || servicos.isEmpty()) {
            throw new IllegalArgumentException("A lista de serviços não pode ser nula ou vazia.");
        }
        this.servicos = servicos;
    }
}
