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
@Table(name="tipoEndereco")
public class TipoEndereco implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name="idTipoEndereco", nullable=false)
    private Integer idTipoEndereco;
    
    @Column(name="descricaoTipoEndereco", nullable=false, length = 80)
    private String descricaoTipoEndereco;

    @OneToMany
    @ForeignKey(name="tipoEnderecoEndereco")
    private List<Endereco> enderecos;
    
    public TipoEndereco() {
    }

    public Integer getIdTipoEndereco() {
        return idTipoEndereco;
    }

    public void setIdTipoEndereco(Integer idTipoEndereco) {
        this.idTipoEndereco = idTipoEndereco;
    }

    public String getNomeTipoEndereco() {
        return descricaoTipoEndereco;
    }

    public void setNomeTipoEndereco(String descricaoTipoEndereco) {
        this.descricaoTipoEndereco = descricaoTipoEndereco;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idTipoEndereco);
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
        final TipoEndereco other = (TipoEndereco) obj;
        if (!Objects.equals(this.idTipoEndereco, other.idTipoEndereco)) {
            return false;
        }
        return true;
    }
}
    
    