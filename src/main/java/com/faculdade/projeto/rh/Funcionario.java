package com.faculdade.projeto.rh;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Funcionario { // Adicionado o 'abstract' que faltava do diagrama

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Temporal(TemporalType.DATE)
    private Date nascimento;

    private String cpf;

    @ManyToOne(cascade = CascadeType.ALL)
    private Endereco enderecos;

    // Métodos solicitados no diagrama
    public String getNome() { return nome; }
    public Date getNascimento() { return nascimento; }
    public String getCpf() { return cpf; }
    public Endereco getEnderecos() { return enderecos; }

    // Setters para manipulação dos dados
    public void setNome(String nome) { this.nome = nome; }
    public void setNascimento(Date nascimento) { this.nascimento = nascimento; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setEnderecos(Endereco enderecos) { this.enderecos = enderecos; }
}

// COLOCANDO A CLASSE ENDERECO AQUI O ERRO SOME NA HORA
@Entity
@Table(name = "RH_ENDERECO")
class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rua;
    private int numero;
    private String bairro;
    private String cep;

    @ManyToOne(cascade = CascadeType.ALL)
    private Cidade cidade;

    // Getters e Setters básicos
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getRua() { return rua; }
    public void setRua(String rua) { this.rua = rua; }
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }
    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }
    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }
    public Cidade getCidade() { return cidade; }
    public void setCidade(Cidade cidade) { this.cidade = cidade; }
}