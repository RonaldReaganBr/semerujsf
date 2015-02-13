/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wa.tutorial.jsf.semerujsf.model.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author Taw
 */
@Entity
@Table(name="tipoLogradouro")
public class TipoLogradouro implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name="idTipoLogradouro", nullable=false)
    private Integer idTipoLogradouro;
    
    @Column(name="descricaoTipoLogradouro", nullable=false, length = 80)
    private String descricaoTipoLogradouro;

    @OneToMany
    @ForeignKey(name="tipoLogradouroEndereco")
    private List<Endereco> enderecos;
    
    public TipoLogradouro() {
    }

    public Integer getIdTipoLogradouro() {
        return idTipoLogradouro;
    }

    public void setIdTipoLogradouro(Integer idTipoLogradouro) {
        this.idTipoLogradouro = idTipoLogradouro;
    }

    public String getNomeTipoLogradouro() {
        return descricaoTipoLogradouro;
    }

    public void setNomeTipoLogradouro(String descricaoTipoLogradouro) {
        this.descricaoTipoLogradouro = descricaoTipoLogradouro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idTipoLogradouro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoLogradouro other = (TipoLogradouro) obj;
        if (!Objects.equals(this.idTipoLogradouro, other.idTipoLogradouro)) {
            return false;
        }
        return true;
    }
}
    
    