package com.ivogeraldo.contribuintes.domains;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(length = 15, nullable = false)
    private String cnpjCpf;
    @Column(length = 20, nullable = false)
    private String rg;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 10, nullable = false)
    private Date dataCadastro;
    @Column(length = 30, nullable = false)
    private String email;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "naturezajuridica_id")
    private NaturezaJuridica naturezaJuridica;

    public Pessoa() {
    }

    public Pessoa(Integer id, String cnpjCpf, String rg, String nome, Date dataCadastro, String email, NaturezaJuridica naturezaJuridica) {
        this.id = id;
        this.cnpjCpf = cnpjCpf;
        this.rg = rg;
        this.nome = nome;
        this.dataCadastro = dataCadastro;
        this.email = email;
        this.naturezaJuridica = naturezaJuridica;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnpjCpf() {
        return cnpjCpf;
    }

    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public NaturezaJuridica getNaturezaJuridica() {
        return naturezaJuridica;
    }

    public void setNaturezaJuridica(NaturezaJuridica naturezaJuridica) {
        this.naturezaJuridica = naturezaJuridica;
    }
}
