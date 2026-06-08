package com.faculdade.projeto.rh;

import jakarta.persistence.*;

@Entity
public class Vendedor extends Funcionario {

    @ManyToOne(cascade = CascadeType.ALL)
    private EquipeVenda equipe;

    private float salarioBase;

    // Método solicitado no diagrama (+ getSalario() : float)
    public float getSalario() {
        return this.salarioBase;
    }

    public EquipeVenda getEquipe() { return equipe; }
    public void setEquipe(EquipeVenda equipe) { this.equipe = equipe; }
    public void setSalarioBase(float salarioBase) { this.salarioBase = salarioBase; }
}
