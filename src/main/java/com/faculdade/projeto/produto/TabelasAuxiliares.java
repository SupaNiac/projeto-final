package com.faculdade.projeto.produto;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "PRD_DEPARTAMENTO")
class PrdDepartamento {
    @Id
    @Column(name = "ID_DEPARTAMENTO")
    private Long idDepartamento;
    private String descricao;
}

@Entity
@Table(name = "PRD_CATEGORIA")
class PrdCategoria {
    @Id
    @Column(name = "ID_CATEGORIA")
    private Long idCategoria;
    private String descricao;

    @Column(name = "ID_DEPARTAMENTO")
    private Long idDepartamento;
}

@Entity
@Table(name = "PRD_SUBCATEGORIA")
class PrdSubcategoria {
    @Id
    @Column(name = "ID_SUBCATEGORIA")
    private Long idSubcategoria;
    private String descricao;

    @Column(name = "ID_CATEGORIA")
    private Long idCategoria;
}

@Entity
@Table(name = "PRD_MARCA")
class PrdMarca {
    @Id
    @Column(name = "ID_MARCA")
    private Long idMarca;
    private String descricao;
}

@Entity
@Table(name = "PRD_PRECO_VENDA")
class PrdPrecoVenda {
    @Id
    @Column(name = "ID_PRECO_VENDA")
    private Long idPrecoVenda;

    @Column(name = "ID_PRODUTO")
    private Long idProduto;

    @Column(name = "PRECO_VENDA")
    private BigDecimal precoVenda;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_VALIDADE_INICIAL")
    private Date dataValidadeInicial;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_VALIDADE_FINAL")
    private Date dataValidadeFinal;
}

@Entity
@Table(name = "PRD_UNIDADE_MEDIDA")
class PrdUnidadeMedida {
    @Id
    @Column(name = "ID_UNIDADE_MEDIDA")
    private Long idUnidadeMedida;
    private String descricao;

    @Column(name = "ID_PRODUTO")
    private Long idProduto;
}

@Entity
@Table(name = "PRD_PRODUTO_SIMILAR")
class PrdProdutoSimilar {
    @Id
    @Column(name = "ID_PRODUTO")
    private Long idProduto;

    @Column(name = "ID_PRODUTO_SIMILAR")
    private Long idProdutoSimilar;
}