package com.ivogeraldo.contribuintes.domains;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "naturezajuridica")
public class NaturezaJuridica implements Serializable {
    private static final long serialVersionUID = 1l;

    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Integer codigo;
    @Column(length = 100, nullable = false)
    private String nome;
    
    public NaturezaJuridica(){
    }
    
    public NaturezaJuridica(Integer id, Integer codigo, String nome) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NaturezaJuridica other = (NaturezaJuridica) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "NaturezaJuridica{" + "id=" + id + ", codigo=" + codigo + ", nome=" + nome + '}';
    }

    
}
