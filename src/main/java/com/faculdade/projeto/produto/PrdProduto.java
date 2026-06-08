package com.faculdade.projeto.produto;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "PRD_PRODUTO")
public class PrdProduto {

    @Id
    @Column(name = "ID_PRODUTO")
    private Long idProduto;

    private String codigo;
    private String descricao;

    @Column(name = "ID_SUBCATEGORIA")
    private Long idSubcategoria;

    @Column(name = "ID_MARCA")
    private Long idMarca;

    @Column(name = "ID_UNIDADE_MEDIDA")
    private Long idUnidadeMedida;

    @Column(name = "ESPECIFICACAO_TECNICA")
    private String especificacaoTecnica;

    private String status;

    @Column(name = "PESO_BRUTO")
    private BigDecimal pesoBruto;

    @Column(name = "PESO_LIQUIDO")
    private BigDecimal pesoLiquido;

    @Column(name = "QTD_MULT")
    private Integer qtdMult;

    @Column(name = "QTD_MIN")
    private Integer qtdMin;

    @Column(name = "COD_BARRA")
    private String codBarra;

    public Long getIdProduto() { return idProduto; }
    public void setIdProduto(Long idProduto) { this.idProduto = idProduto; }
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

}
